package constants;

public enum ItemNumbersConstants {
	MAX_QUALITY(50),
	FIRST_SELL_IN_POINT_FOR_BP_AB(11),
	SECOND_SELL_IN_POINT_FOR_BP_AB(6);

	private final int quality;

	ItemNumbersConstants(int i) {
		this.quality = i;
	}

	public int getQuality() {
		return quality;
	}
}
