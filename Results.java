import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.function.Function;

class Results extends Copies{
    static String filePathCorrection;
    static String filePathCopy;
    static ArrayList<String> temp = new ArrayList<>();
    static int index;
    static Label copy;
    static ArrayList<Label> list = new ArrayList<>();


    public static void openFile() {
   }


    public static Label nextcopy(){
        for (index=0;index<temp.size();index++){
        Copies.copieEtudiant=Program.readCopy(Program.fillstring(filePathCopy));
        copy = new Label(Copies.copieEtudiant);
        Functions.customLabels(copy,null,200,200,ClassAbstract.font1);
        list.add(index,copy);}

        return list.get(1);
    }

    public static void initResults(){ //scene 2 Results

        Copies.note = Program.compare(Program.fillstring(filePathCopy), Program.fillstring(filePathCorrection));
        Copies.corrigeQCM = Program.readCorrection(Program.fillstring(filePathCorrection));
        //Copies.copieEtudiant=Program.readCopy(Program.fillstring(filePathCopy));
        //temp.get()=Program.readCopy(Program.fillstring(filePathCopy));







        Main main = new Main();
        Main.btn6.setOnAction(event -> ClassAbstract.stack1.getChildren().add(nextcopy()));

        Text correction = new Text(Copies.corrigeQCM);
        Functions.customTexts(correction,200,200,ClassAbstract.font1,200,Color.BLACK);


        Text note = new Text("Note : "+ Copies.note);
        Functions.customTexts(note,200,200,ClassAbstract.font1,50,Color.RED);



        Functions.customStacks(ClassAbstract.stack1,200,30,ClassAbstract.border,
        300,400,ClassAbstract.background);
        Functions.customStacks(ClassAbstract.stack2,550,30,ClassAbstract.border,
        300,400,ClassAbstract.background);
        Functions.customStacks(ClassAbstract.stack3,150,450,ClassAbstract.border,
        30,15,ClassAbstract.background);

        //ClassAbstract.stack1.getChildren().add(nextcopy());
        ClassAbstract.stack2.getChildren().add(correction);
        ClassAbstract.stack3.getChildren().add(note);
        //System.out.println(copy);

    }

}
