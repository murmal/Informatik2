package info2;

/**Klasse f�r die Br�che.
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
	 * @param nenner �bergibt dem Konstruktor die int-Werte f�r Nenner.
	 * @param zaehler �bergibt dem Konstruktor die int-Werte f�r Zaehler.
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
	
	/**Methode zum addieren von zwei Br�chen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man zum vorhandenen Bruch addieren will.
	 * @return gek�rzter Bruch.
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
	
	
	/**Methode zum subtrahieren von zwei Br�chen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man vom vorhandenen Bruch subrathieren will.
	 * @return gek�rzter Bruch.
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
	
	/**Methode zum multiplizieren von zwei Br�chen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man mit dem vorhandenen Bruch multiplizieren will.
	 * @return gek�rzter Bruch.
	 */
	public Bruch multi(Bruch bruch2) {
		Bruch multi = new Bruch(this.nenner * bruch2.nenner, this.zaehler * bruch2.zaehler);
		return this.kuerzen(multi);
	}
	
	/**Methode zum dividieren von zwei Br�chen.
	 * 
	 * @param bruch2 ist ein Bruch, welchem man durch vorhandenen Bruch dividieren will.
	 * @return gek�rzter Bruch.
	 */
	public Bruch div(Bruch bruch2) {
		Bruch div = new Bruch(this.nenner * bruch2.zaehler, this.zaehler * bruch2.nenner);
		return this.kuerzen(div);
	}
	
	/**Methode zum k�rzen von zwei Br�chen.
	 * 
	 * @param bruch ist ein Bruch, welchem k�rzen will.
	 * @return gek�rzter Bruch.
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
