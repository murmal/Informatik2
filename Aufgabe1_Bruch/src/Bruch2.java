/**Klasse Bruch22.
 	 * 
	 */
public class Bruch2 {

	
	private int nenner = 1;
	private int zaehler = 0;
	
	public int getNenner() {
		return nenner;
	}


	public void setNenner(int nenner) {
		if (nenner != 0){
			this.nenner = nenner;
		}
		else{
			System.out.println("Geben Sie bitte eine Zahl ungleich 0 ein.");
		}
	}


	public int getZaehler() {
		return zaehler;
	}


	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
		
	}
	/**Default Konstruktor.
	 */
	public Bruch2() {
		
	}
	
	/**Konstruktor.
	 * 
	 * @param bruch um einen Bruch2 durch ein Objekt bruch zu erzeugen.
	 */
	public Bruch2(Bruch2 bruch) {
		
		this.nenner = bruch.getNenner();
		this.zaehler = bruch.getZaehler();
		
	}
	
	/**Konstruktor.
	 * 
	 * @param nenner übergibt dem Konstruktor die int-Werte für Nenner.
	 * @param zaehler übergibt dem Konstruktor die int-Werte für Zaehler.
	 * 
	 * 
	 */
	public Bruch2(int nenner, int zaehler) {
		if (nenner != 0) {
		this.nenner = nenner;
		} else {
				System.out.println("Geben Sie bitte eine Zahl ungleich 0 ein.");
				}
		
		this.zaehler = zaehler;
	}
	
	/**Methode zum addieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch2, welchem man zum vorhandenen Bruch2 addieren will.
	 * @return gekürzter Bruch2.
	 */
	public void add(Bruch2 bruch2) {
		
		if (this.nenner == bruch2.nenner) {
			this.zaehler = this.zaehler + bruch2.zaehler;
			kuerzen();
		} else {

			this.nenner = this.nenner * bruch2.nenner;
			this.zaehler = (this.zaehler * bruch2.nenner) + (bruch2.zaehler * this.nenner);
		}
		kuerzen();
		
	}
	
	
	/**Methode zum subtrahieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch2, welchem man vom vorhandenen Bruch2 subrathieren will.
	 * @return gekürzter Bruch2.
	 */
	public void sub(Bruch2 bruch2) {
		if (this.nenner == bruch2.nenner) {
			this.zaehler = this.zaehler - bruch2.zaehler;
		} else {
		
		
			this.nenner = this.nenner * bruch2.nenner;
			this.zaehler = (this.zaehler * bruch2.nenner) - (bruch2.zaehler * this.nenner);
		}
		kuerzen();
	}
	
	/**Methode zum multiplizieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch2, welchem man mit dem vorhandenen Bruch2 multiplizieren will.
	 * @return gekürzter Bruch2.
	 */
	public void multi(Bruch2 bruch2) {
		this.nenner = this.nenner * bruch2.nenner;
		this.zaehler = this.zaehler * bruch2.zaehler;
		kuerzen();
	}
	
	/**Methode zum dividieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch2, welchem man durch vorhandenen Bruch2 dividieren will.
	 * @return gekürzter Bruch2.
	 */
	public void div(Bruch2 bruch2) {
		this.nenner = this.nenner * bruch2.zaehler;
		this.zaehler = this.zaehler * bruch2.nenner;
		kuerzen();
	}
	
	/**Methode zum kürzen von zwei Brüchen.
	 * 
	 * @param bruch ist ein Bruch2, welchem kürzen will.
	 * @return gekürzter Bruch2.
	 */
	public void kuerzen() {
		int ggt;
		int a = this.nenner;
		int b = this.zaehler;
		
		if (a == 0) {
			ggt = b;	
		} else {
			while (b != 0) {
				if (a > b) {
					a -= b; 
				} else {
					b -= a;
				}
			}
			ggt = a;
		}
		this.nenner /= ggt;
		this.zaehler /= ggt;
	
	}
}
