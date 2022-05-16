package com.bridgelabz;

public class LinkedList<K> {
    public MapNode head;
    public MapNode tail;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void append(MapNode newNode) {
        if (head == null)
            head = newNode;
        if (tail == null)
            tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public MapNode search(K key){
        MapNode temp = head;
        while (temp != null && temp.getNext()!= null){
            if (temp.getKey().equals(key)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
    public String toString(){
        return "LinkedListNodes{" + head + "}";
    }
}
