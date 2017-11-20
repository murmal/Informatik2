

public class Link {

	
	public Link next = null;
	public Link previous = null;
	public String data = null;
	int zaehler = 0;
	
	public Link (String data){
		this.data = data;
		zaehler();
	}
	
	public void zaehler(){
		zaehler++;
	}
	
	public void display(){
		System.out.println(data);
	}

	

	public static void main(String[]args){
		
		LinkedList list = new LinkedList();
		
		list.addFirst("eingeschobener Link1");
		list.addFirst("eingeschobener Link2");
		list.addLast("neuestes Element");
		list.addFirst("eingeschobener Link3");
		list.addFirst("ältestes Element");
		list.add(1, "neues ältestes Element");
	
		
		System.out.println("ende gelände");
		
	}





}
