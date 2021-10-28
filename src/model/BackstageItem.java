package model;

import constants.ItemNumbersConstants;
import services.ItemService;

public class BackstageItem extends ItemWrapper {

	public BackstageItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(ItemNumbersConstants.MAX_QUALITY.getQuality(), this));
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(ItemNumbersConstants.FIRST_SELL_IN_POINT_FOR_BP_AB.getQuality(), this));
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(ItemNumbersConstants.SECOND_SELL_IN_POINT_FOR_BP_AB.getQuality(), this));
		this.setQuality(this.getSellIn() > 0 ? 0 : this.getQuality());
		return this;
	}
}
