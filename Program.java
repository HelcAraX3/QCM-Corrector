import java.util.Objects;
import java.util.Arrays;
public class Program {
    /*String[][] tabl1 = new String[][]{
            {"1","A","B","","",""},
            {"2","","B","","D",""},
            {"3","","B","C","",""},
            {"4","","","","","E"}
    };
    //corrigé
    String[][] tabl2 = new String[][]{
            {"1","","B","","D",""},
            {"2","","","","D",""},
            {"3","","B","C","",""},
            {"4","","","","","E"}
    };*/
    public static double comparer(String[][] tab1, String[][] tab2) {
        double score = 0.2; //point s'ajoutant pour chaque bonne réponse
        double pen = 0.05; //valeur de la pénalité (malus)
        double k = 0;
        //Comparaison des valeurs de chaque colonne. La case du corrigé ne doit pas être vide.
        // Si c'est le cas, pas de score
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 1; j < tab1[i].length; j++) {
                boolean reponsePasFausse = (Objects.equals(tab1[i][j], tab2[i][j]));
                boolean reponseExistante = (!Objects.equals(tab2[i][j], ""));
                if (reponsePasFausse){
                    if(reponseExistante) k = k + score;
                }
                else{
                    if(!reponseExistante) k = k - pen;
                }
            }
            System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" +"Note avec incrementation: " + "%.2f", k); //Résultat par question
        }
        {return k;
        }
    }
    /*public static void main() {
        Program p = new Program();
        p.comparer(p.tabl1, p.tabl2);
    }*/
}