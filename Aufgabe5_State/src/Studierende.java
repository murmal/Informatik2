
public class Studierende extends Einwohner {
	/**
	 * Konstruktor der Studierenden Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Studierenden.
	 */
	public Studierende(int income) {
		this.tax = true;
		this.taxFree = 6000;
		this.socialTax = false;
		this.income = income;
	}

}
