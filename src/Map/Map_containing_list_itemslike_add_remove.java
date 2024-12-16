package Map;

import java.util.*;

public class Map_containing_list_itemslike_add_remove {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sahil");
		map.put(2, "aniket");
		map.put(3, "akash");
		map.put(4, "raj");
		map.put(5, "sai");
		System.out.println();
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(6, "omkar");
		map1.put(7, "yash");
		map1.put(8, "tushar");
		System.out.println("Map 1");
		for (Map.Entry<Integer, String> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		System.out.println();
		System.out.println("Map 2");
		for (Map.Entry<Integer, String> e : map1.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		System.out.println("Insert map into another map");
		Map<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);
		map2.putAll(map1);
		System.out.println(map2);
		System.out.println();
		System.out.println("Remove items from the map");
		map.remove((3));
		for (Map.Entry<Integer, String> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		System.out.println();
		System.out.println();
		System.out.println("Search specific key from the map");
		System.out.println("Is the key '2' present? " + map.containsKey(2));
		System.out.println("Is the key '6' present? " + map.containsKey(6));
		System.out.println();
		System.out.println("Get value of the specified key");
		String val = (String) map.get(2);
		System.out.println(val);
		System.out.println();
	}
}
