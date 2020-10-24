package List;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		Vectors obj = new Vectors();
		obj.init();

	}
	
	void init() {
		
		Vector<String> list = new Vector<String>();
		list.add("vivek");
		list.add("Hema");
		list.add("pilu");
		
		Iterator<String>  itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Value : "+ itr.next());
			System.out.println("Ref : "+ itr);
		}
		
	}

}
