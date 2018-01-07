
/**Klasse f�r die Links.
 * 
 * @param <e> Typ
	 */
public class Link<e> {

	
	private Link<e> next = null;
	private Link<e> previous = null;
	private e data = null;
	
	/**Konstruktor f�r Link.
	 * 
	 * @param data wird der Wert des Links
	 */
	public Link(e data) {
		this.data = data;
	
	}
	
	/** Getter f�r next.
	 * 
	 * 
	 * @return gibt den Link "next" zur�ck
	 */
	public Link<e> getNext() {
		return next;
	}


	/**Setter f�r next.
	 * 
	 * @param next legt den Wert f�r next fest.
	 */
	public void setNext(Link<e> next) {
		this.next = next;
	}


	/** Getter f�r previous.
	 * 
	 * 
	 * @return gibt den Link "previous" zur�ck
	 */
	public Link<e> getPrevious() {
		return previous;
	}


	/**Setter f�r previous.
	 * 
	 * @param previous legt den Wert f�r previous fest.
	 */
	public void setPrevious(Link<e> previous) {
		this.previous = previous;
	}


	/** Getter f�r data.
	 * 
	 * 
	 * @return gibt den String "data" zur�ck
	 */
	public e getData() {
		return data;
	}



	
/**Zum testen.
 * 
 * @param args ...
 */
	public static void main(String[]args) {
		
		LinkedList<String> list = new LinkedList<String>();

		list.addFirst("erstes Element");
		list.addLast("addLast");
		list.addLast("addLast1");
		list.add(1, "eingeschobenes Element");
		list.addLast("wirklich letztes Element");
		list.addLast("wirklich letztes Element");
		list.addLast("wirklich letztes Element");
	
		System.out.println(list.getSize());
		

	
		
		
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	
		list2.addFirst(1);
		list2.addLast(2);
		list2.addLast(3);
		list2.add(1, 4);
		list2.addLast(5);
		list2.addLast(6);
		list2.addLast(7);
	
		System.out.println(list.getSize());
		
	
	}





}