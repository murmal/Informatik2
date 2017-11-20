

public class Link {

	
	public Link next = null;
	public Link previous = null;
	public String data = null;
	
	
	public Link (String data){
		this.data = data;
	
	}
	
	
	
	public void display(){
		System.out.println(data);
	}

	

	public static void main(String[]args){
		
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
