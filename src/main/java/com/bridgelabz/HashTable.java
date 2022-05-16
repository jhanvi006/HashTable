package com.bridgelabz;

public class HashTable<K, V> {
    LinkedList<K> linkedList;
    public HashTable() {
        this.linkedList = new LinkedList<>();
    }
    public V get(K key){
        MapNode<K,V> mapNode = (MapNode<K,V>) this.linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }
    public void add(K key, V value) {
        MapNode<K,V> mapNode = (MapNode<K,V>) this.linkedList.search(key);
        if (mapNode == null){
            mapNode = new MapNode<>(key, value);
            this.linkedList.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }
    public String toString(){
        return "HashMapNode{" + linkedList.toString() + "}";
    }
}
