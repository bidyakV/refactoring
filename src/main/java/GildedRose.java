import model.Item;
import model.ItemWrapper;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

		List<Item> itemList = Arrays.stream(items)
				.map(ItemFactory::getItem)
				.map(ItemWrapper::updateQualityRef)
				.map(ItemWrapper::getItem)
				.collect(Collectors.toList());
		items = new Item[itemList.size()];
		items = itemList.toArray(items);
	}

	public Item[] getItems() {
		return items;
	}
}
