
public class Angestellte extends Einwohner {

	public Angestellte (int income){
		this.tax = true;
		this.taxFree = 12000;
		this.socialTax = true;
		this.income = income;		
	}
	
	
}
