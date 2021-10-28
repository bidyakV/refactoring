package model;

public abstract class ItemWrapper {
	protected Item item;

	public ItemWrapper(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public abstract ItemWrapper updateQualityRef();

}
