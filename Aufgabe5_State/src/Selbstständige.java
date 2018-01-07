
public class Selbstständige extends Einwohner {
	
	public Selbstständige (int income){
		this.tax = true;
		this.taxFree = 0;
		this.socialTax = false;
		this.income = income;		
	}
	
}
