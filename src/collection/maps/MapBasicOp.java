package collection.maps;

import java.util.HashMap;

import java.util.Map;


public class MapBasicOp {

	Map<Character, Integer> map1 = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		
		String str = "Vvivek";
		
		MapBasicOp obj = new MapBasicOp();
		obj.countChar(str);
		obj.print();
		
	}
	
	void addData(char key, int value) {
		map1.put(key, value);
	}
	
	void print() {
		
		for(Character i: map1.keySet()){
			System.out.println(i + " - "+ map1.get(i));
		}
	}
	
	void countChar(String str) {
		
		char arr[] = str.toCharArray();
		
		for(int i =0 ; i< arr.length ; i++) {
			if(map1.containsKey(arr[i])) {
				map1.put(arr[i], map1.get(arr[i]) +1);
			}else {
				map1.put(arr[i], 1);
			}
		}
	}

}
