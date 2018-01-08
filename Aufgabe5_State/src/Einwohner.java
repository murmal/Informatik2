
public abstract class Einwohner {
	/**
	 * Muss der Einwohner Steuer zahlen.
	 */
	public boolean tax;
	/**
	 * Wie viel darf er steuerfrei verdienen.
	 */
	public int taxFree;
	/**
	 * Muss der Einwohner Sozial-Steuer zahlen.
	 */
	public boolean socialTax;
	/**
	 * Jährliches Einkommen.
	 */
	public int income;

	/**
	 * Berechnet die Sozial-Steuer.
	 * 
	 * @return Anzahl Sozial-Steuer.
	 */
	public int getSocialTax() {
		int tax = 0;

		if (this.socialTax == true) {
			tax = (int) ((double) income * 0.28);
		}

		return tax;
	}

	/**
	 * Berechnet die Steuer.
	 * 
	 * @return Anzahl Steuer.
	 */
	public int getTax() {

		int tax = 0;

		if (this.tax == true) {

			int taxFreeNet = income - taxFree;
			if (taxFreeNet < 0) {
				taxFreeNet = 0;
			}

			int rate = getTaxRate(this.income);
			tax = (int) ((((double) rate) / 100.0) * (double) (taxFreeNet));

		}

		return tax;

	}

	/**
	 * Berechnet die Steuerrate.
	 * 
	 * @return Anzahl Steuerrate.
	 */
	private int getTaxRate(int income) {

		if (income <= 12000) {
			return 10;
		} else if (income <= 24000) {
			return 25;
		} else if (income <= 50000) {
			return 30;
		} else if (income <= 75000) {
			return 40;
		} else if (income > 75000) {
			return 50;
		}

		return 0;

	}

}
