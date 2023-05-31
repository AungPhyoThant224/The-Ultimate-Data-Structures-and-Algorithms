import java.util.HashMap;
import java.util.HashSet;

public class HashMapTest {
    public Character firstNoneDuplicate(String input){
        if(input == null){
            return null;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = input.toCharArray();
        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        
        for(var c : map.keySet()){
            if(map.get(c) == 1){
                return c;
            }
        }

        return null;
    }


    public Character firstDuplicate(String input){
        if(input == null){
            return null;
        }

        HashSet<Character> map = new HashSet<>();
        char[] ch = input.toCharArray();

        for(var c: ch){
            if(map.contains(c)){
                return c;
            }else{
                map.add(c);
            }
        }

        return null;
    }

    public void sort(int input, HashSet<Integer> set){
        set.add(input);
    }
}
