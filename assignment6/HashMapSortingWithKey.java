	package com.collection.assignment6;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSortingWithKey {

			static Map<String, Integer> map = new HashMap<>();

			public static void sortbykey()
			{
			TreeMap<String, Integer> sorted
					= new TreeMap<>(map);

				for (Map.Entry<String, Integer> entry :
					sorted.entrySet())
					System.out.println("Key = " + entry.getKey()
									+ ", Value = "
									+ entry.getValue());
			}

			public static void main(String args[])
			{
				map.put("Prashant", 60);
				map.put("Prafulla", 90);
				map.put("Nikhil", 60);
				map.put("Bhushan", 50);
				map.put("Pranil", 25);

				sortbykey();
			}
		}

