import model.Item;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class GildedRoseTest {
	private final Item[] items = {
			new Item("other", 10, 5),
			new Item("Aged Brie", 4, 5),
			new Item("Aged Brie", 4, 50),
			new Item("Sulfuras, Hand of Ragnaros", 80, 2),
			new Item("Backstage passes to a TAFKAL80ETC concert", 20, 20),
			new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20),
			new Item("Backstage passes to a TAFKAL80ETC concert", 3, 20)
	};
	private GildedRose gildedRose = new GildedRose(items);
	@Test
	public void updateQualityRef() {
		gildedRose.updateQualityRef();
		Item[] result = gildedRose.getItems();
		Item[] requiredItems = {
				new Item("other", 9, 4),
				new Item("Aged Brie", 3, 6),
				new Item("Aged Brie", 3, 50),
				new Item("Sulfuras, Hand of Ragnaros", 80, 2),
				new Item("Backstage passes to a TAFKAL80ETC concert", 19, 21),
				new Item("Backstage passes to a TAFKAL80ETC concert", 8, 22),
				new Item("Backstage passes to a TAFKAL80ETC concert", 2, 23)
		};
		Arrays.stream(result).forEach(System.out::println);
	}
}