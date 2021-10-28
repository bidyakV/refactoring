package model;

import services.ItemService;

public class BackstageItem extends ItemWrapper {
	public BackstageItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public BackstageItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.checkQualityByNumberAndUpdateQuality(50, this));
		this.setQuality(ItemService.checkQualityByNumberAndUpdateQuality(11, this));
		this.setQuality(ItemService.checkQualityByNumberAndUpdateQuality(6, this));
		this.setQuality(this.getSellIn() > 0 ? 0 : this.getQuality());
		return this;
	}
}
