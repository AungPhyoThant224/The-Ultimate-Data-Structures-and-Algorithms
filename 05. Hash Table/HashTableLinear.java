import java.util.Arrays;

public class HashTableLinear {
    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] entries;
    private int count;
    public HashTableLinear(int count){
        entries = new Entry[count];
    }

    public void push(int key, String value){
        var index = hash(key);
        var bucket = entries[index];
        if(bucket == null){
            entries[index] = new Entry(key, value);
            count++;
        }
        else{
            for(int i = index; i < entries.length; i++){

                if(i+1  == entries.length){
                    Entry[] newEntries = new Entry[entries.length * 2];
                    for(int j = 0; j < entries.length; j++){
                        newEntries[j] = entries[j];
                    }
                    entries = newEntries;
                }

                if(entries[i] == null){
                    entries[i] = new Entry(key, value);
                    count++;
                    break;
                }
                else if(entries[i].key == key){
                    entries[i].value = value;
                    break;
                }
            }
        }
    }

    public String get(int key){
        var index = getEntryIndex(key);
        var entry = index == -1 ? null : entries[index];
        return  entry == null ? null : entry.value; 
    }

    public String remove(int key){
        var index = getEntryIndex(key);
        var entry = index == -1 ? null : entries[index];
        if(entry == null){
            throw new IllegalStateException();
        }
        entries[index] = null;
        count--;
        return entry.value;
    }

    public int size(){
        return count;
    }

    private int getEntryIndex(int key){
        for(int i = 0; i < entries.length; i++){
            if(entries[i] == null){
                continue;
            }

            if(entries[i].key == key){
                return i;
            }
        }
        return -1;
    }

    private int hash(int key){
        return key % entries.length;
    }

    // @Override
    // public String toString(){
    //     return Arrays.toString(entries);
    // }
}
