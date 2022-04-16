import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Arrays;
import static java.lang.String.format;


public class Program extends Copies{


   static String str;

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
            corrige = corrige + format("\n"+" "+ Arrays.toString(tab2[i])+"\n");
        }
    return corrige;
    }

    public static String readCopy(String[][] tab1) {
        String copie_etu ="";
        for (int i = 0; i < tab1.length; i++) {
            //System.out.format("\n"+"Question "+(i+1)+" "+ Arrays.toString(tab1[i])+"\n" );
            copie_etu = copie_etu + format("\n"+" "+ Arrays.toString(tab1[i])+"\n");
        }
        return copie_etu;

    }






    public static String[][] fillstring(String filename) {
        String [][] str = new String[10][6];
        String FieldDelimiter = ",";
        BufferedReader br0;

        try {
            br0 = new BufferedReader(new FileReader(filename));
            String line;

            int i = 0;
            while ((line = br0.readLine()) != null) {
                //name[0]=(line.split(FieldDelimiter, 0));
                //toto.add(line.split(FieldDelimiter, 0));
                str[i] = line.split(FieldDelimiter, 0);
                i++;

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




       /* for (int i =0;i<10;i++){
            for (int j= 0;j<6;j++){
                System.out.printf(name.get(i)[j]+"  ");
        }
            System.out.println("\n");
        }*/

//        System.out.println(name.get(1)[1]);

            return str;
        }

    /*public static String versString(){
        String test = null;
        for (int i =0;i<10;i++){
            for (int j= 0;j<6;j++){
                test = test +System.out.printf((Program.fillstring().get(i)[j]+"  "));
            }
            System.out.println("\n");
        }
    return test;*/
        //return CsvFile;




}
