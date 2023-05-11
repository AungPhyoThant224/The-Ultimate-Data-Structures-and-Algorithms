import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    
    // ---------------Mosh Solution------------------
    public char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        map = stringToMap(chars);

        for(var ch: chars){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    public char firstRepeatingCharacter(String str){
        Set<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();

        for(var ch: chars){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }

        return Character.MIN_VALUE;

    }

    public Map<Character, Integer> stringToMap(char[] chars){
        Map<Character, Integer> map = new HashMap<>();
        
        for(var ch: chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        return map;
    }

    //--------------My Solution---------------
    // public void findNonRepeatingChar(){
    //     String text = "a green apple";
    //     char[] charArray = text.toCharArray();
    //     int count = 0;

    //     for(int i = 0; i < charArray.length; i++){
    //         for(int j = 0; j < charArray.length; j++){
    //             if(charArray[i] == charArray[j] && i != j){
    //                 count = count + 1;
    //             }
    //         }
    //         if(count == 0){
    //             System.out.println(charArray[i]);
    //             break;
    //         } 
    //         else{
    //             // System.out.println("Count : " + count + " and " + charArray[i]);
    //             count = 0;
    //         }
    //     }
    // }
}
