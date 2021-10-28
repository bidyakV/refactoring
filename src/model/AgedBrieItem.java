package model;

import services.ItemService;

public class AgedBrieItem extends ItemWrapper {
	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public AgedBrieItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.checkQualityByNumberAndUpdateQuality(50, this));
		if (this.getSellIn() < 6) {
			this.setQuality(ItemService.checkQualityByNumberAndUpdateQuality(50, this));
		}
		return this;
	}

}
