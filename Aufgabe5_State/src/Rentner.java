
public class Rentner extends Einwohner {
	/**
	 * Konstruktor der Rentner Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Rentner.
	 */
	public Rentner(int income) {
		this.tax = false;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;
	}

}
