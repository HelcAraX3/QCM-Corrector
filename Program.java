import java.util.Objects;
import java.util.Arrays;
import static java.lang.String.format;

public class Program {

    public static String comparer(String[][] tab1, String[][] tab2) {
        double score = 0.2; //point s'ajoutant pour chaque bonne réponse
        double pen = 0.05; //valeur de la pénalité (malus)
        double k = 0;
        String copie = "";
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
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" +"Note avec incrementation: " + "%.2f", k); //Résultat par question
            //copie = copie+ format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" +"Note avec incrementation: " + "%.2f", k);

        }
        {return format("%.2f", k);
        }
    }
    public static String LectureCorrige(String[][] tab2) {
        String corrige ="";
        for (int i = 0; i < tab2.length; i++) {
            System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab2[i])+"\n" );
            corrige = corrige + format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab2[i])+"\n");
        }
    return corrige;
    }

    public static String LectureCopie(String[][] tab1) {
        String copie_etu ="";
        for (int i = 0; i < tab1.length; i++) {
            System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" );
            copie_etu = copie_etu + format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n");
        }
        return copie_etu;
    }
}