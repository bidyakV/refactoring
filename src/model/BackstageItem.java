package model;

import services.ItemService;

public class BackstageItem extends ItemWrapper {

	public BackstageItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(50, this));
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(11, this));
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(6, this));
		this.setQuality(this.getSellIn() > 0 ? 0 : this.getQuality());
		return this;
	}
}
