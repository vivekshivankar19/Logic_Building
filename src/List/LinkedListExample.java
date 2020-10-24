package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedListExample obj = new LinkedListExample();
		obj.init();

	}
	
	void init() {
		
		LinkedList<String> list = new LinkedList<String>();
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
