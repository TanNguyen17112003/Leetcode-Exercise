class MyHashSet {
    List<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i) == key) return;
        }
        set.add(key);
    }
    
    public void remove(int key) {
        set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return set.indexOf(key) != -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */