
/**Klasse Bruchtest.
 * 
 */
public class bruchtest {
	/**Methode zum testen.
	 * 
	 * @param args ..

	 */
	public static void main(String[] args) {
		
		Bruch2 bruch = new Bruch2(5, 8);
		Bruch2 bruch1 = new Bruch2(5, 3);
		
		
		bruch.add(bruch1);
		System.out.println("Nenner:" + bruch.getNenner());
		System.out.println("Zaehler:" + bruch.getZaehler());
		
		
		bruch.sub(bruch1);
		System.out.println("Nenner:" + bruch.getNenner());
		System.out.println("Zaehler:" + bruch.getZaehler());
		
		
		bruch.multi(bruch1);
		System.out.println("Nenner:" + bruch.getNenner());
		System.out.println("Zaehler:" + bruch.getZaehler());
		
		
		bruch.div(bruch1);
		System.out.println("Nenner:" + bruch.getNenner());
		System.out.println("Zaehler:" + bruch.getZaehler());
	}
	






}