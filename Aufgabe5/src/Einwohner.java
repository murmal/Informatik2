
public abstract class Einwohner {

	public boolean tax;
	public int taxFree;
	public boolean socialTax;
	public int income;
	
	
	
	
	public int getSocialTax(){
		int tax = 0;
		
		if (this.socialTax == true){			
			tax = (int) ((double) income * 0.28);
		}
		
		return tax;
	}
	
	
	public int getTax(){
		
		int tax = 0;
		
		if(this.tax == true){
			
			int taxFreeNet = income-taxFree;
			if (taxFreeNet < 0){
				taxFreeNet = 0;
			}
			
			int rate = getTaxRate(this.income);
			tax = (int) ((((double) rate) / 100.0) * (double) (taxFreeNet));
		
		}
		
		
		
		return tax;
		
	}
	
	private int getTaxRate(int income){
	
		
		if (income <= 12000){
			return 10;
		} else if (income <= 24000){
			return 25;
		} else if (income <= 50000){
			return 30;
		} else if (income <= 75000){
			return 40;
		} else if (income > 75000){
			return 50;
		}
		
		return 0;
		
	}
	
}
