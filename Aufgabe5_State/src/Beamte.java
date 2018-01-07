
public class Beamte extends Einwohner {

	public Beamte (int income){
		this.tax = true;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;		
	}
	
}
