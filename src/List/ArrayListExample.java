package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample obj = new ArrayListExample();
		obj.init();

	}
	
	public void init() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("vivek");
		list.add("Hema");
		list.add("pilu");
		
		Iterator<String>  itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Value : "+ itr.next());
		}
	
	}

}
