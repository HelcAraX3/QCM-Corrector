package com.example.projetqcm;

import java.util.HashMap;
import java.util.Map;

public class Evalue {
    String nom;
    Map<String, Double> metrics = new HashMap<>();

    String[] liste = new String[] {"Etu1","Etu2","Etu3"};
    String[][] Etu1 = new String[][]{
            {"1","A","B","","",""},
            {"2","","","","D","E"},
            {"3","A","","C","",""},
            {"4","","B","","","E"}
    };
    String[][] Etu2 = new String[][]{
            {"1","","B","","","E"},
            {"2","","B","C","D",""},
            {"3","","","C","",""},
            {"4","A","","","","E"}
    };
    String[][] Etu3 = new String[][]{
            {"1","A","","","",""},
            {"2","","","","D",""},
            {"3","","","C","",""},
            {"4","","","","","E"}
    };
    //corrigé
    String[][] corr = new String[][]{
            {"1","","B","","D",""},
            {"2","","","","D",""},
            {"3","","B","C","",""},
            {"4","","","","","E"}
    };

   void evaluer(String[] liliste) {
       for (int i = 0; i <= liste.length; i++) {
           Program.comparer(Etu1, corr);
           Program.comparer(Etu2, corr);
           Program.comparer(Etu3, corr);
       }
   }
    public static void main(String[] args) {
        System.out.println();

    }
}
