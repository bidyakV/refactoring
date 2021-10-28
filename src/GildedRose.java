import model.Item;
import model.ItemWrapper;

import java.util.Arrays;

/**
 * @author : Vasyl Bidiak
 * @created : 25.10.2021
 * @className : GildedRose
 **/

public class GildedRose {

	private Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQualityRef() {
		items = (Item[]) Arrays.stream(items)
				.map(ItemFactory::getItem)
				.map(ItemWrapper::updateQualityRef)
				.toArray();
	}
}
