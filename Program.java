import java.util.Objects;
import java.util.Arrays;
import static java.lang.String.format;

public class Program extends Copies{

    public static String compare(String[][] tab1, String[][] tab2) {
        double score = 0.2; //points + for good answers
        double pen = 0.05; //points - for bad answers
        double k = 0;
        //Compare values between each column. The case of corrected QCM must not be empty
        //If that case, no scores
        for (int i = 1; i < tab1.length; i++) {
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

        }
        {return format("%.2f", k);
        }
    }
    public static String readCorrection(String[][] tab2) {
        String corrige ="";
        for (int i = 0; i < tab2.length; i++) {
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab2[i])+"\n" );
            corrige = corrige + format("\n"+(i)+" "+ Arrays.toString(tab2[i])+"\n");
        }
    return corrige;
    }

    public static String readCopy(String[][] tab1) {
        String copie_etu ="";
        for (int i = 0; i < tab1.length; i++) {
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" );
            copie_etu = copie_etu + format("\n"+(i)+" "+ Arrays.toString(tab1[i])+"\n");
        }
        return copie_etu;

    }

    /**
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
    }**/




}
