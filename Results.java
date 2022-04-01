import javafx.scene.control.Label;
import javafx.scene.paint.Color;

class Results extends Copies{

    public static void initResults(){ //scene 2 Results
        for (int i =1; i<Copies.arrays.length; i++) {
            Program p = new Program();
            Copies.note = p.compare(Copies.arrays[i], Copies.corr);
            Copies.copieEtudiant = p.readCopy(Copies.arrays[i]);
            Copies.corrigeQCM = Program.readCorrection(Copies.corr);
        }
        Label answer = new Label(Copies.copieEtudiant);
        answer.setWrapText(true);
        answer.setLayoutX(200);
        answer.setLayoutY(200);
        answer.setFont(ClassAbstract.font1);

        Label corrige = new Label(Copies.corrigeQCM);
        corrige.setWrapText(true);
        corrige.setLayoutX(200);
        corrige.setLayoutY(200);
        corrige.setFont(ClassAbstract.font1);

        Label note_etu = new Label("Note : "+ Copies.note);
        note_etu.setWrapText(true);
        note_etu.setLayoutX(200);
        note_etu.setLayoutY(200);
        note_etu.setFont(ClassAbstract.font1);
        note_etu.setTextFill(Color.RED);

        ClassAbstract.stack1.getChildren().add(answer);
        ClassAbstract.stack1.setLayoutX(150);
        ClassAbstract.stack1.setLayoutY(30);
        ClassAbstract.stack1.setBackground(ClassAbstract.background);
        ClassAbstract.stack1.setBorder(ClassAbstract.border);
        ClassAbstract.stack1.setMinSize(300,400);

        ClassAbstract.stack2.getChildren().add(corrige);
        ClassAbstract.stack2.setLayoutX(550);
        ClassAbstract.stack2.setLayoutY(30);
        ClassAbstract.stack2.setBackground(ClassAbstract.background);
        ClassAbstract.stack2.setBorder(ClassAbstract.border);
        ClassAbstract.stack2.setMinSize(300,400);

        ClassAbstract.stack3.getChildren().add(note_etu);
        ClassAbstract.stack3.setLayoutX(150);
        ClassAbstract.stack3.setLayoutY(450);
        ClassAbstract.stack3.setBackground(ClassAbstract.background);
        ClassAbstract.stack3.setBorder(ClassAbstract.border);
    }


    /**
    public static void functionBack(){
        for (int i =Copies.arrays.length; i >=0; i--) {
            Program p = new Program();
            Copies.note=p.comparer(Copies.arrays[i], Copies.corr);
            Copies.copieEtudiant=p.LectureCopie(Copies.arrays[i]);
            Copies.corrigeQCM=Program.LectureCorrige(Copies.corr);}
    }**/

    /**
    public static void functionNext(){
        for (int i =0; i >Copies.arrays.length; i++) {
            Program p = new Program();
            Copies.note=p.comparer(Copies.arrays[i], Copies.corr);
            Copies.copieEtudiant=p.LectureCopie(Copies.arrays[i]);
            Copies.corrigeQCM=Program.LectureCorrige(Copies.corr);}
    }**/
}
