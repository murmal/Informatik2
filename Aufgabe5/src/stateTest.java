
public class stateTest {

	public static void main(String args[]){
		
		
		
		Studierende s = new Studierende(3000);
		System.out.println("Studierender mit " + s.income + "€ Einkommen: \n");
		System.out.println("Tax : " + s.getTax()+ "\t Social Tax : "+ s.getSocialTax()+ "\n");
		Studierende s1 = new Studierende(30000);
		System.out.println("Studierender mit " + s1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + s1.getTax()+ "\t Social Tax : "+ s1.getSocialTax() + "\n\n");
		
		Angestellte a = new Angestellte(3000);
		System.out.println("Angestellter mit " + a.income + "€ Einkommen: \n");
		System.out.println("Tax : " + a.getTax()+ "\t Social Tax : "+ a.getSocialTax()+ "\n");
		Angestellte a1 = new Angestellte(60000);
		System.out.println("Angestellter mit " + a1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + a1.getTax()+ "\t Social Tax : "+ a1.getSocialTax()+ "\n\n");
	
		
		Beamte b = new Beamte(34567);
		System.out.println("Beamter mit " + b.income + "€ Einkommen: \n");
		System.out.println("Tax : " + b.getTax()+ "\t Social Tax : "+ b.getSocialTax()+ "\n");
		Beamte b1 = new Beamte(123456);
		System.out.println("Beamter mit " + b1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + b1.getTax()+ "\t Social Tax : "+ b1.getSocialTax()+ "\n\n");
	
		
		Selbstständige ss = new Selbstständige(20002);
		System.out.println("Selbstständiger mit " + ss.income + "€ Einkommen: \n");
		System.out.println("Tax : " + ss.getTax()+ "\t Social Tax : "+ ss.getSocialTax()+ "\n");
		Selbstständige ss1 = new Selbstständige(12478922);
		System.out.println("Selbstständiger mit " + ss1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + ss1.getTax()+ "\t Social Tax : "+ ss1.getSocialTax()+ "\n\n");
	
		
		Hinterbliebene h = new Hinterbliebene(12313);
		System.out.println("Hinterbliebener mit " + h.income + "€ Einkommen: \n");
		System.out.println("Tax : " + h.getTax()+ "\t Social Tax : "+ h.getSocialTax()+ "\n");
		Hinterbliebene h1 = new Hinterbliebene(51531);
		System.out.println("Hinterbliebener mit " + h1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + h1.getTax()+ "\t Social Tax : "+ h1.getSocialTax()+ "\n\n");
		
		Rentner r = new Rentner(123123123);
		System.out.println("Rentner mit " + r.income + "€ Einkommen: \n");
		System.out.println("Tax : " + r.getTax()+ "\t Social Tax : "+ r.getSocialTax()+ "\n");
		Rentner r1 = new Rentner(123123);
		System.out.println("Rentner mit " + r1.income + "€ Einkommen: \n");
		System.out.println("Tax : " + r1.getTax()+ "\t Social Tax : "+ r1.getSocialTax()+ "\n\n");
	
	
	
	}
}
