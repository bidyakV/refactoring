package model;

import constants.ItemNumbersConstants;
import services.ItemService;

public class AgedBrieItem extends ItemWrapper {

	public AgedBrieItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setSellIn(this.getSellIn() - 1);
		this.setQuality(ItemService.updateQuality(this));
		return this;
	}

}
