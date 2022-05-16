package com.bridgelabz;

public class MapNode<K, V> {
    K key;
    V value;
    MapNode<K, V> next;
    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }
    public K getKey(){
        return key;
    }
    public void setKey(K key){ this.key = key; }
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }
    public MapNode getNext(){
        return next;
    }
    public void setNext(K next){
        this.next = (MapNode<K, V>) next;
    }

    public String toString(){
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MapNode{" + "K=").append(key).append(" V=").append(value).append("}");
        if (next != null)
            mapNodeString.append("->").append(next);
        return mapNodeString.toString();
    }
}
