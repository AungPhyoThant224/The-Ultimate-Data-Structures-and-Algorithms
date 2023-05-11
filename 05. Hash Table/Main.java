class Main{
    public static void main(String[] args) {

        // HashTable hashTable = new HashTable();

        // hashTable.put(1, "A");
        // hashTable.put(6, "B");
        // hashTable.put(8, "C");
        // hashTable.put(3, "D");
        // hashTable.remove(2);
        // System.out.println(hashTable.get(8));

        // ------------------------
        // CharFinder finder = new CharFinder();
        // var character = finder.firstRepeatingCharacter("green apple");
        // System.out.println(character);

        // --------------Exercises---------------
        // HashTableExercises hash = new HashTableExercises();
        // int[] items = {2, 7, 11, 15};
        // System.out.println(hash.mostFrequent(items));
        // System.out.println(hash.countPairWithDiff(items, 3));
        // System.out.println(hash.twoSum(items, 22));


        HashTableLinear hash = new HashTableLinear(5);
        hash.push(0, "a");
        hash.push(1, "b");
        hash.push(0, "c");
        System.out.println(hash.size());

    }
}