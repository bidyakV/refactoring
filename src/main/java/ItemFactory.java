import constants.ItemNameConstants;
import model.AgedBrieItem;
import model.BackstageItem;
import model.Item;
import model.ItemWrapper;
import model.OtherItem;

public class ItemFactory {

	public static ItemWrapper getItem(Item item) {

		switch (ItemNameConstants.getByName(item.getName())) {
			case AGED_BRIE:
				return new AgedBrieItem(item);
			case BACKSTAGE:
				return new BackstageItem(item);
			default:
				return new OtherItem(item);
		}
	}
}
