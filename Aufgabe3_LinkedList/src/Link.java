
/**Klasse für die Links.
	 */
public class Link {

	
	private Link next = null;
	private Link previous = null;
	private String data = null;
	
	/**Konstruktor für Link.
	 * 
	 * @param data wird der Wert des Links
	 */
	public Link(String data) {
		this.data = data;
	
	}
	
	/** Getter für next.
	 * 
	 * 
	 * @return gibt den Link "next" zurück
	 */
	public Link getNext() {
		return next;
	}


	/**Setter für next.
	 * 
	 * @param next legt den Wert für next fest.
	 */
	public void setNext(Link next) {
		this.next = next;
	}


	/** Getter für previous.
	 * 
	 * 
	 * @return gibt den Link "previous" zurück
	 */
	public Link getPrevious() {
		return previous;
	}


	/**Setter für previous.
	 * 
	 * @param previous legt den Wert für previous fest.
	 */
	public void setPrevious(Link previous) {
		this.previous = previous;
	}


	/** Getter für data.
	 * 
	 * 
	 * @return gibt den String "data" zurück
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
		
		System.out.println("ende gelände");
		
	}





}