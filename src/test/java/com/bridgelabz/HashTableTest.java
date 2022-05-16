package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableTest {
    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnFrequency(){
        String sentence = "To be or not to be";
        HashTable<String, Integer> hashTable = new HashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = hashTable.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            hashTable.add(word, value);
        }
        System.out.println(hashTable);
        int toFrequency = hashTable.get("to");
        Assertions.assertEquals(2, toFrequency);
        int beFrequency = hashTable.get("be");
        Assertions.assertEquals(2, beFrequency);
        int orFrequency = hashTable.get("or");
        Assertions.assertEquals(1, orFrequency);
        int notFrequency = hashTable.get("not");
        Assertions.assertEquals(1, notFrequency);
    }
}
