package com.example.projetqcm;

import java.util.*;
public class ArrayListConversion {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<String>(); ////ArrayList declaration and initialization
        l.add("Hello"); //adding elements
        l.add("Java");
        l.add("Tpoint");
        String array[] = new String[l.size()];// ArrayList to String Array conversion
        for(int j =0;j<l.size();j++){
            array[j] = l.get(j);
        }
        for(String k: array)
        {
            System.out.println(k); // Printing array elements
        }
    }
}