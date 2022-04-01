package com.example.projetqcm;

public class Copies {
    public static void main(String[] args) {

        String[][] arr1 = new String[][]{{"Naomie"},
                {"1","A","B","","",""},
                {"2","","B","","D",""},
                {"3","","B","C","",""},
                {"4","","","","","E"}
        };
        String[][] arr2 = new String[][]{{"Paul"},
                {"1","A","B","","",""},
                {"2","","B","","D",""},
                {"3","","B","C","",""},
                {"4","","","","","E"}
        };
        String[][] arr3 = new String[][] {{"Nono"},
                {"1","A","B","","",""},
                {"2","","B","","D",""},
                {"3","","B","C","",""},
                {"4","","","","","E"}
        };

        String[][] corr = new String[][]{{"Corrigé"},
                {"1","","B","","D",""},
                {"2","","","","D",""},
                {"3","","B","C","",""},
                {"4","","","","","E"}
        };

        String[][][] arrays = {arr1, arr2, arr3};

        for (int i = 1; i < arrays.length; i++) {
                Program p = new Program();
                p.comparer(arrays[i], corr);
                p.LectureCorrige(corr);
                p.LectureCopie(arrays[i]);

        }
    }
}