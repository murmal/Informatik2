
public class Angestellte extends Einwohner {
	/**
	 * Konstruktor der Angestellen Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Angestellten.
	 */
	public Angestellte(int income) {
		this.tax = true;
		this.taxFree = 12000;
		this.socialTax = true;
		this.income = income;
	}

}
