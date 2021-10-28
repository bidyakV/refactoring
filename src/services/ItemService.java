package services;

import model.Item;

public class ItemService {

	public static Integer updateQualityAfterCheckByNumber(Integer quality, Item item) {
		return checkQualityByNumber(quality, item) ? item.getQuality() + 1 : item.getQuality();
	}
	public static Integer updateQualityAfterCheckByPositive(Item item) {
		return checkQualityByPositive(item) ? item.getQuality() - 1 : item.getQuality();
	}
	public static boolean checkQualityByNumber(Integer quality, Item item) {
		return item.getQuality() < quality;
	}
	public static boolean checkQualityByPositive(Item item) {
		return item.getQuality() > 0;
	}
}
