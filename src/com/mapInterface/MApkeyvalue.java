package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MApkeyvalue {
    public static void main(String[] args) {
        String s = "hello world";

        char[] ca1 = s.toCharArray();
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        {
            for (char c : ca1) {
                if (m1.containsKey(c)){
                    m1.put(c, 1);
                }
                else{
                    m1.put(c, m1.get(c)+1);
                }
            }
            for(Map.Entry entry : m1.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }
    }
}