
public class Selbstst�ndige extends Einwohner {
	/**
	 * Konstruktor der Selbstst�ndige Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Selbstst�ndigen.
	 */
	public Selbstst�ndige(int income) {
		this.tax = true;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;
	}

}
