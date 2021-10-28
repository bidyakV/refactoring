package constants;

public enum ItemConstants {
	AGED_BRIE ("Aged Brie"),
	BACKSTAGE ("Backstage passes to a TAFKAL80ETC concert"),
	SULFURAS ("Sulfuras, Hand of Ragnaros");

	private final String name;

	ItemConstants(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
