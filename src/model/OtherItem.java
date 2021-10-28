package model;

import constants.ItemNameConstants;
import services.ItemService;

public class OtherItem extends ItemWrapper {

	public OtherItem(Item item) {
		super(item.getName(), item.getSellIn(), item.getQuality());
	}

	@Override
	public ItemWrapper updateQualityRef() {
		if (!ItemNameConstants.SULFURAS.getName().equals(this.getName())) {
			this.setSellIn(this.getSellIn() - 1);
			this.setQuality(ItemService.updateQualityAfterCheckByPositive(this));
			if (this.getSellIn() > 0) {
				this.setQuality(ItemService.updateQualityAfterCheckByPositive(this));
			}
		}
		return this;
	}
}
