public class Copies {

    // Simulation of QCM copies ( Ideally CSV )
    static String[][] arr1 = new String[][]{{"Naomie"},
            {"1", "A", "B", "", "", ""},
            {"2", "", "B", "", "D", ""},
            {"3", "", "B", "C", "", ""},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "A", "", "", "", ""}
    };
    static String[][] arr2 = new String[][]{{"Paul"},
            {"1", "A", "B", "", "", ""},
            {"2", "", "B", "", "D", ""},
            {"3", "", "B", "C", "", ""},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "B", "", "", ""}
    };
    static String[][] arr3 = new String[][]{{"Nono" + " " + "01/04/2022"},
            {"1", "A", "B", "", "D", ""},
            {"2", "", "B", "", "D", ""},
            {"3", "", "B", "C", "", ""},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"}
    };
    static String[][] corr = new String[][]{{"Corrigé QCM" + " " + "01/04/2022"},
            {"1", "A", "B", "", "D", ""},
            {"2", "", "B", "", "D", ""},
            {"3", "", "B", "C", "", ""},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "", "", "", "E"},
            {"4", "", "B", "", "", ""}
    };

    static String[][][] arrays = {arr1, arr2, arr3};
    static String copieEtudiant;
    static String corrigeQCM;
    static String note;

}

