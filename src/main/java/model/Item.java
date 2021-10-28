package model;

import java.util.Objects;

/**
 * @author : Vasyl Bidiak
 * @created : 25.10.2021
 * @className : model.Item
 **/

public class Item {
	private String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "model.Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
	}
}
