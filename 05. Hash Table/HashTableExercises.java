import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
    
    public int mostFrequent(int[] items){
        Map<Integer, Integer> map = new HashMap<>();

        for(var item : items){
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count+1);
        }

        var mostCountValue = 0;
        for(var item: items){
            if(map.get(item) > mostCountValue){
                mostCountValue = item;
            }
        }
        return mostCountValue;
    }

    public int countPairWithDiff(int[] items, int k){
        int pairCount = 0;
        for(int i = 0; i < items.length; i++){
            for(int j = i; j < items.length; j++){
                if((items[i] + k) == items[j] || (items[i] - k) == items[j]){
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    public Set<Integer> twoSum(int[] items, int target){
        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < items.length; i++){
            for(int j = i; j < items.length; j++){
                if(items[i] + items[j] == target && i != j){
                    hashSet.add(i);
                    hashSet.add(j);
                    break;
                }
            }
        }

        return hashSet;
    }
}
