

public class LinkedList {
	
	public Link lastLink = null; //neuester Link in der Liste
	public Link firstLink = null; //ältester Link in der Liste
	private int zaehler = 0;
	
	
	
	
	
	//fügt einen Link vor dem ältesten Element hinzu
	public void addFirst(String value){
	
		Link newLink = new Link(value);
		
		newLink.previous = firstLink;
		newLink.next = null;
		
		if(firstLink != null){
			firstLink.next = newLink;
		}
		
		firstLink = newLink;
		
		if(newLink.previous == null){
			lastLink = newLink;
		}
		zaehler++;
	}
	
	
	//fügt einen Link nach dem neuesten Element hinzu
	public void addLast(String value){
		
		Link newLink = new Link(value);
		
		newLink.next = lastLink;
		newLink.previous = null;
		
		if(lastLink != null){
			lastLink.previous = newLink;					
		}
		
		lastLink = newLink;
		
		if(newLink.next == null){
			firstLink = newLink;
		}
		zaehler++;
	}
	
	
	
	public void add(int index, String value){	
		
		Link newLink = new Link(value);
		
		Link temp = getLink(index);
		if (temp == null){
			System.out.println("Geben sie einen anderen Index ein.");
		}
		else{
			if (temp.next != null){
				newLink.next = temp.next;
			}
			
			newLink.previous = temp; 
		
			
		
			if (newLink.next != null){
			
				temp.next.previous = newLink; 
			}
		
			else{
			
				firstLink = newLink;
			}
			temp.next = newLink;
			if(newLink.previous == null){
				lastLink = newLink;
			}
			zaehler++;
		}
		
	}
	
	
	private Link getLink(int index){
		
		Link temp = firstLink;
		
		for (int counter = 1;  counter != index; counter++){
			
			if(temp.previous != null){
			
				temp = temp.previous;
			}
			else {
				return null;
			}
		}
		return temp;
	}
	
	
	public String get(int index){
		
		Link temp = lastLink;
		for (int counter = 1;  counter != index; counter++){
			
			temp = temp.previous;
			//mit asserts sichern
			}
		
		return temp.data;
		
	}
	
	
	
	public String removeFirst(){
		
		if (this.firstLink != null){
			
			if (firstLink.previous != null){
				
				firstLink = firstLink.previous;
				firstLink.next = null;
			}
			else { 
				firstLink = null;
				lastLink = null;
			}
			zaehler--;
			return "Der erste Link wurde entfernt.";
			
		}
		else {
			return "Es existiert kein Link in der Liste.";
		}
		
	
	}
	
	
	
	public String removeLast(){
		
		if (this.lastLink != null){
			
			if (lastLink.next!= null){
				
				lastLink= lastLink.next;
				lastLink.previous = null;
			}
			else { 
				firstLink = null;
				lastLink = null;
			}
			zaehler--;
			return "Der letzte Link wurde entfernt.";
		}
		else {
			return "Es existiert kein Link in der Liste.";
		}
	}
	
	
	
	public int getSize(){
		
		return zaehler;
		
	}
}

