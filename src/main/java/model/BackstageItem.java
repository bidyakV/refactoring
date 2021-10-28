package model;

import constants.ItemNumbersConstants;
import services.ItemService;

public class BackstageItem extends ItemWrapper {

	public BackstageItem(Item item) {
		super(item);
	}

	@Override
	public ItemWrapper updateQualityRef() {
		item.setSellIn(item.getSellIn() - 1);
		item.setQuality(ItemService.updateQuality(item));
		item.setQuality(ItemService.updateQualityBySellIn(ItemNumbersConstants.FIRST_SELL_IN_POINT_FOR_BP_AB.getQuality(), item));
		item.setQuality(ItemService.updateQualityBySellIn(ItemNumbersConstants.SECOND_SELL_IN_POINT_FOR_BP_AB.getQuality(), item));
		item.setQuality(item.getSellIn() <= 0 ? 0 : item.getQuality());
		return this;
	}
}
