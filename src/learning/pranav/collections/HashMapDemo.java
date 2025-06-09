package learning.pranav.collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//creates a new HashMap
		HashMap<Integer, String> hashmapObj1 = new HashMap<Integer, String>();
		//can be declared this way too
		HashMap<Integer, String> hashmapObj2 = new HashMap<>();
		// HashMap<> hashmapObj3 = new HashMap<Integer, String>(); illegal
		HashMap<Integer, String> hashmapObj3 = new HashMap<>();
		for (int i = 0; i <= 20; i++) {
			//inserts into a HashMap with integer as key and string as value
			hashmapObj1.put(i, "Value"+ i);
		}
		//putting into an existing value replaces it
		hashmapObj1.put(1, "New Value");
		//gets a value from HashMap using get(key)
		System.out.println("value 1 in hashmap-1 is " + hashmapObj1.get(1) + "\n");
		if (hashmapObj2.isEmpty()) System.out.println("hashmap-2 is empty\n");
		System.out.println("copying all the values in hashmap-1 into hasmap-2\n");
		//copies all the values in HashMap-1 into HashMap-2
		hashmapObj2.putAll(hashmapObj1);
		//performs an operation for all the values in an HashMap
		hashmapObj2.forEach((i, s) -> {System.out.println("value at " + i + " in hashmap-2 is " + s);});
		/*this wont work
		 * because hashmapObj3 is empty
		 *hashmapObj3.replaceAll((k, v) -> "replaced value:" + v);
		 *hashmapObj3.forEach((k, v) -> {System.out.println("Value in HashMap-3 at " + k + " is " + v);});
		 */
		//this will work because we populate it first
		hashmapObj3.putAll(hashmapObj2);
		hashmapObj3.replaceAll((k, v) -> "replaced value:" + v);
		//you can also replace an individual value
		hashmapObj3.replace(2, hashmapObj3.get(2), "Replaced Replaced value 1");
		//or you can also do this
		hashmapObj3.replace(2, "Replaced Replaced value 2");
		//you can get the size of HashMap with this
		int hashmap3Size = hashmapObj3.size();
		System.out.println();
		System.out.println("removing all the keys which are even in hashmap-3\n");
		for (int i = 0; i <= hashmap3Size; i++) {
			//you can also remove individual objects using remove(key)
			if(i % 2 == 0) hashmapObj3.remove(i);
		}
		
		hashmapObj3.forEach((k, v) -> {System.out.println("Value in HashMap-3 at " + k + " is " + v);});
		System.out.println();
		
		//clears all values in HashMap-2
		System.out.println("clearing hashmap-2\n");
		hashmapObj2.clear();
		if (hashmapObj2.isEmpty()) System.out.println("hashmap-2 is now empty");
		//get the key values
		System.out.println("the keys in hashmap-3 are: " + hashmapObj3.keySet());
		//get the entry values
		System.out.println("the entry values in hashmap-3 are" +  hashmapObj3.entrySet());
		//check if it has a key
		if (hashmapObj3.containsKey(2)) System.out.println("2 is a key in hashmap-3");
		//check if it has a value
		if (hashmapObj3.containsValue("Replaced Replaced value 2")) System.out.println("hashmap-3 contains the value");
		//we can clone a HashMap by casting to a hashmap because clone() returns an object
		@SuppressWarnings("unchecked")
		HashMap<Integer, String> clonedHashMap = (HashMap<Integer, String>)hashmapObj3.clone();
		clonedHashMap.forEach((k,v) -> {System.out.println( k  + "|" + v);});
		
	}
}
