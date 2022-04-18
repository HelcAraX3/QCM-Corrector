import AppGui.Functions;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Stack;

class Results extends Copies {
    static String filePathCorrection;
    static String filePathCopy;
    static ArrayList<String> temp = new ArrayList<>();
    static int index;
    static int compt=0;
    static ArrayList<Label> list = new ArrayList<>();


    public static void openFile() {
    }


    public static void nextCopy(){

        Text copy = new Text(Program.readCopy(Program.fillstring(temp.get(compt))));
        Text [] copies= new Text[temp.size()];
        copies[compt]=copy;
        copies[compt].setLayoutX(200);
        copies[compt].setLayoutY(30);
        Functions.customTexts(copies[compt], 200, 200, ClassAbstract.font1, 200, Color.BLACK);
        ClassAbstract.stack1.getChildren().clear();
        ClassAbstract.stack1.getChildren().add(copies[compt]);

        compt++;
        if (compt==temp.size()){
            compt=0;
        }


    }




        public static void initResults () { //scene 2 Results

            Copies.note = Program.compare(Program.fillstring(filePathCopy), Program.fillstring(filePathCorrection));
            Copies.corrigeQCM = Program.readCorrection(Program.fillstring(filePathCorrection));
            Copies.copieEtudiant = Program.readCopy(Program.fillstring(temp.get(compt)));





            Label copy = new Label(Copies.copieEtudiant);
            Text correction = new Text(Copies.corrigeQCM);
            Functions.customTexts(correction, 200, 200, ClassAbstract.font1, 200, Color.BLACK);


            Text note = new Text("Note : " + Copies.note);
            Functions.customTexts(note, 200, 200, ClassAbstract.font1, 50, Color.RED);

            Functions.customStacks(ClassAbstract.stack1, 200, 30, ClassAbstract.border,
                    300, 400, ClassAbstract.background);
            Functions.customStacks(ClassAbstract.stack2, 550, 30, ClassAbstract.border,
                    300, 400, ClassAbstract.background);
            Functions.customStacks(ClassAbstract.stack3, 150, 450, ClassAbstract.border,
                    30, 15, ClassAbstract.background);

            //ClassAbstract.stack1.getChildren().add(copy);
           // ClassAbstract.stack1.getChildren().add(copy);
            ClassAbstract.stack2.getChildren().add(correction);
            ClassAbstract.stack3.getChildren().add(note);
            //System.out.println(copy);

        }

    }


