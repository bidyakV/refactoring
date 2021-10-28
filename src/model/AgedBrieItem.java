package model;

import services.ItemService;

public class AgedBrieItem extends ItemWrapper {

	public AgedBrieItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		this.setQuality(ItemService.updateQualityAfterCheckByNumber(50, this));
		if (this.getSellIn() < 6) {
			this.setQuality(ItemService.updateQualityAfterCheckByNumber(50, this));
		}
		return this;
	}

}
