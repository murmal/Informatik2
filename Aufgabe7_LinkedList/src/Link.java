
/**Klasse für die Links.
 * 
 * @param <e> Typ
	 */
public class Link<e> {

	
	private Link<e> next = null;
	private Link<e> previous = null;
	private e data = null;
	
	/**Konstruktor für Link.
	 * 
	 * @param data wird der Wert des Links
	 */
	public Link(e data) {
		this.data = data;
	
	}
	
	/** Getter für next.
	 * 
	 * 
	 * @return gibt den Link "next" zurück
	 */
	public Link<e> getNext() {
		return next;
	}


	/**Setter für next.
	 * 
	 * @param next legt den Wert für next fest.
	 */
	public void setNext(Link<e> next) {
		this.next = next;
	}


	/** Getter für previous.
	 * 
	 * 
	 * @return gibt den Link "previous" zurück
	 */
	public Link<e> getPrevious() {
		return previous;
	}


	/**Setter für previous.
	 * 
	 * @param previous legt den Wert für previous fest.
	 */
	public void setPrevious(Link<e> previous) {
		this.previous = previous;
	}


	/** Getter für data.
	 * 
	 * 
	 * @return gibt den String "data" zurück
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