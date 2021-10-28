package model;

public abstract class ItemWrapper extends Item{

	public ItemWrapper(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public abstract ItemWrapper updateQualityRef();

	protected void checkQualityByNumberAndUpdateQuality(Integer quality) {
		int resultQuality = this.getQuality() < quality ? this.getQuality() + 1 : this.getQuality();
		this.setQuality(resultQuality);
	}

	protected void checkQualityByPositiveAndUpdateQuality() {
		int resultQuality = this.getQuality() > 0 ? this.getQuality() - 1 : this.getQuality();
		this.setQuality(resultQuality);
	}
}
