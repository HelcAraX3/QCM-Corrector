import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Arrays;
import static java.lang.String.format;

public class Program extends Copies{

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
                boolean reponseExistante = (!Objects.equals(tab2[i][j], " "));
                if (reponsePasFausse){
                    if(reponseExistante) k = k + score;
                }
                else{
                    if(!reponseExistante) k = k - pen;
                }
            }

        }
        {return format("%.2f", k);
        }
    }
    public static String LectureCorrige(String[][] tab2) {
        String corrige ="";
        for (int i = 0; i < tab2.length; i++) {
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab2[i])+"\n" );
            corrige = corrige + format("\n"+(i)+" "+ Arrays.toString(tab2[i])+"\n");
        }
    return corrige;
    }

    public static String LectureCopie(String[][] tab1) {
        String copie_etu ="";
        for (int i = 0; i < tab1.length; i++) {
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" );
            copie_etu = copie_etu + format("\n"+(i)+" "+ Arrays.toString(tab1[i])+"\n");
        }
        return copie_etu;


    }

    public static void fonction(){
        for (int i = 1; i < Copies.arrays.length; i++) {
            Program p = new Program();
            Copies.note=p.comparer(Copies.arrays[i], Copies.corr);
            Copies.corrigeQCM=p.LectureCorrige(Copies.corr);
            Copies.copieEtudiant=p.LectureCopie(Copies.arrays[i]);}

    }
















    public static String[][] fillstring(String[][] name) {
        String CsvFile = "Copie.csv";
        String FieldDelimiter = ",";
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < name.length; i++) {
                    for (int j = 0; j < name[i].length; j++) {
                        name[i] = line.split(FieldDelimiter, 0);
                        name[j] = line.split(FieldDelimiter, 0);
                    }

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return name;
    }




}
