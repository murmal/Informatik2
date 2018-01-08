
public class TableTest {

	public static void main(String[]args) {
		
		Table t = new Table();
		Switchcase c = new Switchcase();
		
		
		
		t.trigger(0);
		t.trigger(1);
		t.trigger(1);
		t.trigger(0);
		t.trigger(3);
		t.clear();
		t.trigger(0);
		System.out.println("\n");
		
		c.trigger(0);
		c.trigger(1);
		c.trigger(1);
		c.trigger(0);
		c.trigger(3);
		c.clear();
		c.trigger(0);
	}
}
