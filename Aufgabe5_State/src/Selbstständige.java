
public class Selbstständige extends Einwohner {
	/**
	 * Konstruktor der Selbstständige Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Selbstständigen.
	 */
	public Selbstständige(int income) {
		this.tax = true;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;
	}

}
