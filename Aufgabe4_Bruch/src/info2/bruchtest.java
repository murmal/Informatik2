package info2;
/**Klasse Bruchtest.
 * 
 */
public class bruchtest {
	/**Methode zum testen.
	 * 
	 * @param args ..

	 */
	public static void main(String[] args) {
		
		Bruch bruch = new Bruch(5, 8);
		Bruch bruch1 = new Bruch(5, 3);
		
		
		Bruch c = new Bruch();
		c = bruch.add(bruch1);
		System.out.println("Nenner:" + c.getNenner());
		System.out.println("Zaehler:" + c.getZaehler());
		
		Bruch d = new Bruch();
		d = bruch.sub(bruch1);
		System.out.println("Nenner:" + d.getNenner());
		System.out.println("Zaehler:" + d.getZaehler());
		
		Bruch e = new Bruch();
		e = bruch.multi(bruch1);
		System.out.println("Nenner:" + e.getNenner());
		System.out.println("Zaehler:" + e.getZaehler());
		
		Bruch f = new Bruch();
		f = bruch.div(bruch1);
		System.out.println("Nenner:" + f.getNenner());
		System.out.println("Zaehler:" + f.getZaehler());
	}
	






}