//Dasrshana Thakare
package com.question2;

import java.util.TreeMap;
import java.util.Map;

public class square {
	public static void main(String[] args)
	{
      TreeMap<Integer,Integer> map=new TreeMap<>();
      for(int i=1;i<=20;i++)
		{
			map.put(i, i*i);
		}
		for(Map.Entry e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());		
		}
		TreeMap<Integer,Integer> map1=new TreeMap<>();
		System.out.println("-----------------------------------------");
		map1.putAll(map);			//coping one tree map to another tree map
		System.out.println(map1);
		System.out.println("-----------------------------------------");
		
		System.out.println("To  search for a specific key :"+map.containsKey(7));			//searching a key in a treeMap
		System.out.println("To search a specific value in key: "+map.containsValue(9));		//searching a key in a treeMap
		System.out.println("-----------------------------------------");
		System.out.println("To find greatest key "+map.higherKey(19));			//to get a greatest key
		
		System.out.println("key-value mapping associated with least key in the map "+map.pollFirstEntry());			//to get and remove key
		System.out.println("key-value mapping associated with greatest key in the map "+map.pollLastEntry());			//to get and remove greatest key
		System.out.println(map);

}
}