package model;

import constants.ItemNameConstants;
import services.ItemService;

public class OtherItem extends ItemWrapper {

	public OtherItem(Item item) {
		super(item);
	}

	@Override
	public ItemWrapper updateQualityRef() {
		if (!ItemNameConstants.SULFURAS.getName().equals(item.getName())) {
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(ItemService.updateQualityAfterCheckByPositive(item));
			if (item.getSellIn() < 0) {
				item.setQuality(ItemService.updateQualityAfterCheckByPositive(item));
			}
		}
		return this;
	}
}
