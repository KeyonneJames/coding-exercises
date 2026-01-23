// solution for least recently used cache using a LinkedHashMap - https://leetcode.com/problems/lru-cache/
// time complexity: O(1) for both get and put operations - 0.071s
// space complexity: O(capacity)

// things I learned:
// setting accessOrder to true makes sure that the order of the elements is based on their access (get or put)
// if accessOrder is false, the order is based on insertion order. (capacity, load factor, accessOrder).
// load factor is a measure of how full the hashmap is allowed to get before its capacity is automatically increased.
// so if the load factor is 0.75, when the hashmap is 75% full, it will increase its capacity.
// this is determined by the formula: current capacity * load factor. 
// So a lower lf resizes more often, but uses less memory and a higher lf resizes less often, but uses more memory.

class LRUCache {
    private LinkedHashMap <Integer, Integer> lRUCache; // create a linkedhashmap to store the key value pairs
    private int capacity; // maximum capacity of the cache. It is initialized in the constructor, so the other functions can access it.
    public LRUCache(int capacity) {
        this.capacity = capacity; // setting the capacity
        this.lRUCache = new LinkedHashMap<>(capacity, 0.75f, true); // initializing the linkedhashmap with accessOrder set to true
    } // this automatically puts values in order of access (get or put)

    public int get(int key) {
        if(lRUCache.containsKey(key)){ // if lru has the key, return the value
            return lRUCache.get(key);
        }
        return -1; // else return -1
    }
    
    public void put(int key, int value) {
        if(lRUCache.containsKey(key)){
            lRUCache.put(key,value); // if the key is already present, update the value.
        }                            // could use replace as well but put works the same
            
            lRUCache.put(key, value);
        if(lRUCache.size() > capacity){ // if the current size is greater than capacity, remove the least recently used item
            Iterator<Integer> remove = lRUCache.keySet().iterator(); // iterator to get the keys in order of access
            lRUCache.remove(remove.next()); // .next() gives the first key in the order of access, which is the head of the linkedhashmap
            //System.out.println(lRUCache.keySet()); for debugging
        }
    }
}
