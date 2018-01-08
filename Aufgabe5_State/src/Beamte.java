
public class Beamte extends Einwohner {
	/**
	 * Konstruktor der Beamten Klasse.
	 * 
	 * @param income
	 *            das Einkommen des Beamten.
	 */
	public Beamte(int income) {
		this.tax = true;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;
	}

}
