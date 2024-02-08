package com.example.demo.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionOperations {

    public static void main(String[] args) {
        // HashMap and Map operations
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Traditional for-loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Lambda expression
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Filtering with lambda
        Map<String, Integer> filteredMap = map.entrySet().stream().filter(entry -> entry.getValue() % 2 == 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // List operations
        List<String> list = new ArrayList<>();


        // Traditional for-loop
        for (String item : list) {
            System.out.println("Item: " + item);
        }


        // Lambda expression
        list.forEach(item -> System.out.println("Item: " + item));

        // Filtering with lambda
        List<String> filteredList = list.stream().filter(item -> item.startsWith("B")).collect(Collectors.toList());
    }
}
