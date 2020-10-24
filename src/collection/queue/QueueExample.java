package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
	
		QueueExample obj = new QueueExample();
		obj.init();
		
	}
	
	void init() {
		PriorityQueue<String> list = new PriorityQueue<String>();
		list.add("vivek");
		list.add("Hema");
		list.add("pilu");
		
		System.out.println("head:"+list.element());
		System.out.println("head:"+list.peek());
		
		Iterator<String>  itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Value : "+ itr.next());
		}
		
		list.remove();
		list.poll();
		
		itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(" next Value : "+ itr.next());
		}
	}

}
