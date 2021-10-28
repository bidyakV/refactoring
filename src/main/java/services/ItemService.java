package services;

import constants.ItemNumbersConstants;
import model.Item;

public class ItemService {

	public static Integer updateQuality(Item item) {
		return item.getQuality() < ItemNumbersConstants.MAX_QUALITY.getQuality() ? item.getQuality() + 1 : item.getQuality();
	}
	public static Integer updateQualityAfterCheckByPositive(Item item) {
		return checkQualityByPositive(item) ? item.getQuality() - 1 : item.getQuality();
	}
	public static Integer updateQualityBySellIn(Integer sellIn, Item item) {
		return item.getSellIn() < sellIn ? updateQuality(item) : item.getQuality();
	}
	public static boolean checkQualityByNumber(Integer quality, Item item) {
		return item.getQuality() < quality;
	}
	public static boolean checkQualityByPositive(Item item) {
		return item.getQuality() > 0;
	}
}
