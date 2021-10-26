import java.util.List;

/**
 * @author : Vasyl Bidiak
 * @created : 25.10.2021
 * @className : GildedRose
 **/

public class GildedRose {

	private final String AGED_BRIE = "Aged Brie";
	private final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private final String SULFURAS = "Sulfuras, Hand of Ragnaros";

	private Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQualityRef() {
		for (Item item : items) {
			if (!item.getName().equals(AGED_BRIE) && !item.getName().equals(BACKSTAGE) && !item.getName().equals(SULFURAS)) {
				item.setSellIn(item.getSellIn() - 1);
				item = checkQualityByPositive(item);
				item = item.getSellIn() > 0 ? checkQualityByPositive(item) : item;
			}
			if (item.getName().equals(AGED_BRIE)) {
					item = checkQualityByNumber(item,50);
					item = item.getSellIn() < 6 ? checkQualityByNumber(item,50) : item;
			}
			if (item.getName().equals(BACKSTAGE)) {
				item = checkQualityByNumber(item,11);
				item = checkQualityByNumber(item,6);
				if (item.getSellIn() > 0) {
					item.setQuality(0);
				}
			}
		}
	}

	Item checkQualityByNumber(Item item, Integer quality) {
		if (item.getQuality() < quality) {
			item.setQuality(item.getQuality() + 1);
		}
		return item;
	}

	Item checkQualityByPositive(Item item) {
		if (item.getQuality() > 0) {
			item.setQuality(item.getQuality() - 1);
		}
		return item;
	}
}
