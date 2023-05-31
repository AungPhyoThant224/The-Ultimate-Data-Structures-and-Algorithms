import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        HashMapTest hash = new HashMapTest();
        int[] nums = {};
        System.out.println(hash.firstDuplicate(null));
        System.out.println(hash.firstNoneDuplicate(null));

        HashSet<Integer> set = new HashSet<>();
        for(var num : nums){
            hash.sort(num, set);
        }
        System.out.println(set);

    }
}
