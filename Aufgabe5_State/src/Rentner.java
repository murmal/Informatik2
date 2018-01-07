
public class Rentner extends Einwohner {

	public Rentner (int income){
		this.tax = false;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;		
	}
	
}
