package model;

import services.ItemService;

public class AgedBrieItem extends ItemWrapper {

	public AgedBrieItem(Item item) {
		super(item);
	}

	@Override
	public ItemWrapper updateQualityRef() {
		item.setSellIn(item.getSellIn() - 1);
		item.setQuality(ItemService.updateQuality(item));
		return this;
	}

}
