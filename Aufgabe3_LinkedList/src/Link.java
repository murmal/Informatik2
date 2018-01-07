
/**Klasse f�r die Links.
	 */
public class Link {

	
	private Link next = null;
	private Link previous = null;
	private String data = null;
	
	/**Konstruktor f�r Link.
	 * 
	 * @param data wird der Wert des Links
	 */
	public Link(String data) {
		this.data = data;
	
	}
	
	/** Getter f�r next.
	 * 
	 * 
	 * @return gibt den Link "next" zur�ck
	 */
	public Link getNext() {
		return next;
	}


	/**Setter f�r next.
	 * 
	 * @param next legt den Wert f�r next fest.
	 */
	public void setNext(Link next) {
		this.next = next;
	}


	/** Getter f�r previous.
	 * 
	 * 
	 * @return gibt den Link "previous" zur�ck
	 */
	public Link getPrevious() {
		return previous;
	}


	/**Setter f�r previous.
	 * 
	 * @param previous legt den Wert f�r previous fest.
	 */
	public void setPrevious(Link previous) {
		this.previous = previous;
	}


	/** Getter f�r data.
	 * 
	 * 
	 * @return gibt den String "data" zur�ck
	 */
	public String getData() {
		return data;
	}



	
/**Zum testen.
 * 
 * @param args ...
 */
	public static void main(String[]args) {
		
		LinkedList list = new LinkedList();
		
		list.addFirst("erstes Element");
		list.addLast("addLast");
		list.addLast("addLast1");
		list.add(1, "eingeschobenes Element");
		list.addLast("wirklich letztes Element");
		list.addLast("wirklich letztes Element");
		list.addLast("wirklich letztes Element");
	
		System.out.println(list.getSize());
		
		System.out.println("ende gel�nde");
		
	}





}