package constants;

import org.apache.commons.lang3.EnumUtils;

public enum ItemNameConstants {
	AGED_BRIE ("Aged Brie"),
	BACKSTAGE ("Backstage passes to a TAFKAL80ETC concert"),
	SULFURAS ("Sulfuras, Hand of Ragnaros"),
	OTHER ("other");

	private final String name;

	ItemNameConstants(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public static ItemNameConstants getByName(String name) {
		return EnumUtils.getEnumList(ItemNameConstants.class).stream()
				.filter(item -> item.getName().equals(name))
				.findFirst()
				.orElse(OTHER);
	}
}
