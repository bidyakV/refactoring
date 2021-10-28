package model;

import constants.ItemNumbersConstants;
import services.ItemService;

public class AgedBrieItem extends ItemWrapper {

	public AgedBrieItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(ItemNumbersConstants.MAX_QUALITY.getQuality(), this));
		if (this.getSellIn() < 6) {
			this.setQuality(ItemService.updateQualityAfterCheckByNumber(ItemNumbersConstants.MAX_QUALITY.getQuality(), this));
		}
		return this;
	}

}
