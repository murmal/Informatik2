package info2;

/**Klasse für die Brüche.
 */
public class Bruch {
		
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
	public Bruch() {
		
	}
	
	/**Konstruktor.
	 * 
	 * @param bruch um einen Bruch durch ein Objekt bruch zu erzeugen.
	 */
	public Bruch(Bruch bruch) {
		
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
	public Bruch(int nenner, int zaehler) {
		if (nenner != 0) {
		this.nenner = nenner;
		} else {
				System.out.println("Geben Sie bitte eine Zahl ungleich 0 ein.");
				}
		
		this.zaehler = zaehler;
	}
	
	/**Methode zum addieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man zum vorhandenen Bruch addieren will.
	 * @return gekürzter Bruch.
	 */
	public Bruch add(Bruch bruch2) {
		
		if (this.nenner == bruch2.nenner) {
			Bruch add = new Bruch(this.nenner, this.zaehler + bruch2.zaehler);
			return this.kuerzen(add);
		} else {
		
		
			int neuerNenner = this.nenner * bruch2.nenner;
			int neuerZaehler = (this.zaehler * bruch2.nenner) + (bruch2.zaehler * this.nenner);
		
			Bruch add1 = new Bruch(neuerNenner, neuerZaehler);
			return this.kuerzen(add1);
		}
	}
	
	
	/**Methode zum subtrahieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man vom vorhandenen Bruch subrathieren will.
	 * @return gekürzter Bruch.
	 */
	public Bruch sub(Bruch bruch2) {
		if (this.nenner == bruch2.nenner) {
			Bruch sub = new Bruch(this.nenner, this.zaehler - bruch2.zaehler);
			return this.kuerzen(sub);
		} else {
		
		
			int neuerNenner = this.nenner * bruch2.nenner;
			int neuerZaehler = (this.zaehler * bruch2.nenner) - (bruch2.zaehler * this.nenner);
		
			Bruch sub1 = new Bruch(neuerNenner, neuerZaehler);
			return this.kuerzen(sub1);
		}
	}
	
	/**Methode zum multiplizieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man mit dem vorhandenen Bruch multiplizieren will.
	 * @return gekürzter Bruch.
	 */
	public Bruch multi(Bruch bruch2) {
		Bruch multi = new Bruch(this.nenner * bruch2.nenner, this.zaehler * bruch2.zaehler);
		return this.kuerzen(multi);
	}
	
	/**Methode zum dividieren von zwei Brüchen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man durch vorhandenen Bruch dividieren will.
	 * @return gekürzter Bruch.
	 */
	public Bruch div(Bruch bruch2) {
		Bruch div = new Bruch(this.nenner * bruch2.zaehler, this.zaehler * bruch2.nenner);
		return this.kuerzen(div);
	}
	
	/**Methode zum kürzen von zwei Brüchen.
	 * 
	 * @param bruch ist ein Bruch, welchem kürzen will.
	 * @return gekürzter Bruch.
	 */
	public Bruch kuerzen(Bruch bruch) {
		int ggt;
		int a = bruch.nenner;
		int b = bruch.zaehler;
		
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
		bruch.nenner /= ggt;
		bruch.zaehler /= ggt;
		
		return bruch;
	}
}
