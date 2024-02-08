package com.example.demo.general;

import java.util.List;

public class MyClass {

    private List<String> list;

    public MyClass(List<String> list) {
        this.list = list;
    }

    // method to order strings on this list using alphabetical order
    // make it return something to be able to test it
    // write the code within sort method
    public List<String> sort() {
        list.sort((a, b) -> a.compareTo(b));
        return list;
    }



}
