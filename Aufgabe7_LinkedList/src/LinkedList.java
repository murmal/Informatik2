
/** 
 * Eine Double LinkedList. 
 * 
 * @param <e> Typ der generischen Liste.
 */

public class LinkedList<e> {
	
	private Link<e> lastLink = null; 
	private Link<e> firstLink = null; 
	private  int zaehler = 0;
	
	
	
	
	

	/** Fügt der einen Link an die Erste Stelle ein.
	 * {@param value ist der Inhalt des Links} */
	public void addFirst(e value) {
	
		Link<e> newLink = new Link<e>(value);
		
		newLink.setPrevious(firstLink);
		newLink.setNext(null);
		
		if (firstLink != null) {
			firstLink.setNext(newLink);
		}
		
		firstLink = newLink;
		
		if (newLink.getPrevious() == null) {
			lastLink = newLink;
		}
		zaehler++;
	}
	
	

	/** Fügt der einen Link an die letzten Stelle ein.
	 * {@param value ist der Inhalt des Links} */
	public void addLast(e value) {
		
		Link<e> newLink = new Link<e>(value);
		
		newLink.setNext(lastLink);
		newLink.setPrevious(null);
		
		if (lastLink != null) {
			lastLink.setPrevious(newLink);					
		}
		
		lastLink = newLink;
		
		if (newLink.getNext() == null) {
			firstLink = newLink;
		}
		zaehler++;
	}
	
	
	/** Fügt der einen Link an der gewünschten Stelle ein. 
	 * {@param value ist der Inhalt des Links}
	 * {@param index ist die Gewünschte Stelle}
	 * 
	 * */
	
	public void add(int index, e value) {	
		
		Link<e> newLink = new Link<e>(value);
		
		Link<e> temp = getLink(index);
		if (temp == null) {
			System.out.println("Geben sie einen anderen Index ein.");
		} else {
			if (temp.getNext() != null) {
				newLink.setNext(temp.getNext());
			}
			
			newLink.setPrevious(temp); 
		
			
		
			if (newLink.getNext() != null) {
			
				temp.getNext().setPrevious(newLink); 
			} else {
			
				firstLink = newLink;
			}
			temp.setNext(newLink);
			if (newLink.getPrevious() == null) {
				lastLink = newLink;
			}
			zaehler++;
		}
		
	}
	
	/** Gibt den Link an der gewünschten Stelle zurück.
	 * {@param index ist die Gewünschte Stelle}
	 * {@return gibt den gewünschten Link zurück}*/
	private Link<e> getLink(int index) {
		
		Link<e> temp = firstLink;
		
		for (int counter = 1;  counter != index; counter++) {
			
			if (temp.getPrevious() != null) {
			
				temp = temp.getPrevious();
			} else {
				return null;
			}
		}
		return temp;
	}
	
	/** Gibt den Inhalt des Links an der gewünschten Stelle zurück.
	 * {@param index  ist die Gewünschte Stelle}
	 * {@return gibt den Inhalt des Links zurück}*/
	public e get(int index) {
		
		Link<e> temp = lastLink;
		for (int counter = 1;  counter != index; counter++) {
			
			temp = temp.getPrevious();
			//mit asserts sichern
			}
		
		return temp.getData();
		
	}
	
	
	/** Entfernt den ersten Link in der Liste.
	 * {@return gibt den Inhalt des Links zurück} */
	public String removeFirst() {
		
		if (this.firstLink != null) {
			
			if (firstLink.getPrevious() != null) {
				
				firstLink = firstLink.getPrevious();
				firstLink.setNext(null);
			} else { 
				firstLink = null;
				lastLink = null;
			}
			zaehler--;
			return "Der erste Link wurde entfernt.";
			
		} else {
			return "Es existiert kein Link in der Liste.";
		}
		
	
	}
	
	

	/** Entfernt den letzten Link in der Liste. 
	 * {@return gibt den Inhalt des Links zurück}*/
	public String removeLast() {
		
		if (this.lastLink != null) {
			
			if (lastLink.getNext() != null) {
				
				lastLink = lastLink.getNext();
				lastLink.setPrevious(null);
			} else { 
				firstLink = null;
				lastLink = null;
			}
			zaehler--;
			return "Der letzte Link wurde entfernt.";
		} else {
			return "Es existiert kein Link in der Liste.";
		}
	}
	
	
	/** Gibt die Anzahl der Links in der Liste aus.
	 * {@return gibt die Größe der Liste zurück}*/
	public int getSize() {
		
		return zaehler;
		
	}
}
