
public class Hinterbliebene extends Einwohner {
	/**
	 * Konstruktor der Hinterbliebene Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Hinterbliebene.
	 */
	public Hinterbliebene(int income) {
		this.tax = false;
		this.taxFree = 0;
		this.socialTax = true;
		this.income = income;
	}

}
