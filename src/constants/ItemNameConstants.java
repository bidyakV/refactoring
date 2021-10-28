package constants;

public enum ItemNameConstants {
	AGED_BRIE ("Aged Brie"),
	BACKSTAGE ("Backstage passes to a TAFKAL80ETC concert"),
	SULFURAS ("Sulfuras, Hand of Ragnaros");

	private final String name;

	ItemNameConstants(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
