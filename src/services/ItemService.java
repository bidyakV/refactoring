package services;

import model.Item;

public class ItemService {

	public static Integer checkQualityByNumberAndUpdateQuality(Integer quality, Item item) {
		return item.getQuality() < quality ? item.getQuality() + 1 : item.getQuality();
	}

	public static Integer checkQualityByPositiveAndUpdateQuality(Item item) {
		return item.getQuality() > 0 ? item.getQuality() - 1 : item.getQuality();
	}
}
