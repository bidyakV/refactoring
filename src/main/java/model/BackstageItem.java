package model;

import constants.ItemNumbersConstants;
import services.ItemService;

public class BackstageItem extends ItemWrapper {

	public BackstageItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setSellIn(this.getSellIn() - 1);
		this.setQuality(ItemService.updateQuality(this));
		this.setQuality(ItemService.updateQualityBySellIn(ItemNumbersConstants.FIRST_SELL_IN_POINT_FOR_BP_AB.getQuality(), this));
		this.setQuality(ItemService.updateQualityBySellIn(ItemNumbersConstants.SECOND_SELL_IN_POINT_FOR_BP_AB.getQuality(), this));
		this.setQuality(this.getSellIn() <= 0 ? 0 : this.getQuality());
		return this;
	}
}
