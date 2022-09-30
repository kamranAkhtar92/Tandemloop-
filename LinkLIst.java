package Kamran;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkList {
 public static void main(String[] args) {
  int value[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25 };
  int div[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  Map<Integer, Integer> m = new HashMap<>();

  for (int i = 0; i < div.length; i++) {
   for (int j = 0; j < value.length; j++) {
    if (value[j] % div[i] == 0) {
     if (m.containsKey(div[i]))
      m.put(div[i], m.get(div[i]) + 1);
     else
      m.put(div[i], 1);
    }
   }
  }

  System.out.println(m);
  System.out.println("----------------------");
  String s = "[";
  Set<Entry<Integer, Integer>> e = m.entrySet();

  for (Entry<Integer, Integer> en : e) {
   s += en.getKey() + ":";
   s += en.getValue() + ",";
  }
  
  
  String res="";
  for (int i = 0; i < s.length()-1; i++) {
   res+=s.charAt(i);
  }
  
  System.out.println(res+"]");
  

 }
}