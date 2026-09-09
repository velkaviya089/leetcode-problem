class LRUCache {
    int capacity;
    HashMap<Integer,Integer>map;
    LinkedList<Integer>list;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
    }
        
        
        
    
    
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        list.remove((Integer)key);
        list.addFirst(key);
        return map.get(key);
            
        
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            list.remove((Integer)key);
        }
        map.put(key,value);
        list.addFirst(key);
        if(list.size()>capacity){
            int last=list.removeLast();
            map.remove(last);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */