package info2;

public class Bruch {
		
	private int nenner=1;
	private int zaehler=0;
	
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

	public Bruch(){
		
	}
	
	public Bruch(Bruch bruch){
		
		this.nenner = bruch.getNenner();
		this.zaehler = bruch.getZaehler();
		
	}
	
	public Bruch(int nenner, int zaehler){
		if (nenner != 0){
		this.nenner = nenner;
		}
		else {
				System.out.println("Geben Sie bitte eine Zahl ungleich 0 ein.");}
		
		this.zaehler = zaehler;
	}
	
	
	public Bruch add (Bruch bruch2){
		
		if ( this.nenner == bruch2.nenner){
			Bruch add = new Bruch(this.nenner, this.zaehler+bruch2.zaehler);
			return this.kuerzen(add);
		}
		
		
		int neuerNenner = this.nenner * bruch2.nenner;
		int neuerZaehler = (this.zaehler*bruch2.nenner)+(bruch2.zaehler*this.nenner);
		
		Bruch add1 = new Bruch(neuerNenner, neuerZaehler);
		return this.kuerzen(add1);
	}
	
	
	
	public Bruch sub (Bruch bruch2){
		if ( this.nenner == bruch2.nenner){
			Bruch sub = new Bruch(this.nenner, this.zaehler-bruch2.zaehler);
			return this.kuerzen(sub);
		}
		
		
		int neuerNenner = this.nenner * bruch2.nenner;
		int neuerZaehler = (this.zaehler*bruch2.nenner)-(bruch2.zaehler*this.nenner);
		
		Bruch sub1 = new Bruch(neuerNenner, neuerZaehler);
		return this.kuerzen(sub1);
	}
	
	
	public Bruch multi (Bruch bruch2) {
		Bruch multi = new Bruch(this.nenner * bruch2.nenner, this.zaehler*bruch2.zaehler);
		return this.kuerzen(multi);
	}
	
	public Bruch div (Bruch bruch2){
		Bruch div = new Bruch(this.nenner * bruch2.zaehler, this.zaehler*bruch2.nenner);
		return this.kuerzen(div);
	}
	
	public Bruch kuerzen(Bruch bruch){
		int ggt;
		int a = bruch.nenner;
		int b = bruch.zaehler;
		
		if (a == 0){
			ggt = b;	
		}
		else{
			while( b != 0){
				if ( a > b){
					a -= b; 
				}
				else{
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
