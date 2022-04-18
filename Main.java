import AppGui.Functions;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class Main extends ClassAbstract {


    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("CORRECTEUR DE QCM");
        scene1 = createSceneOne();
        scene2 = createSceneTwo();
        scene3 = createSceneThree();
        stage.setScene(scene1);
        stage.show();
    }


    public static Scene createSceneOne() {
        root1 = new Group();
        Canvas canvas = new Canvas(l,h);
        root1.getChildren().add(canvas);

        //Button 0
        btn0 = new Button();
        Functions.customButtons(btn0,"CORRECTION","-fx-background-color:#abb2b9",
        ClassAbstract.font,Color.BLACK,ClassAbstract.border,
        350,400,300,50);
        //ActionEvent Button 0
        btn0.setOnAction(event ->stage.setScene(scene2)); //scene1 => scene2


        //Button 1
        btn1 = new Button();
        Functions.customButtons(btn1,"STATISTIQUES","-fx-background-color:#abb2b9",
        ClassAbstract.font,Color.BLACK,ClassAbstract.border,
        350,500,300,50);
        //ActionEvent Button 1
        btn1.setOnAction(event ->switchScenes(scene3)); //scene1 => scene3

        //Button 2
        btn2 = new Button();
        Functions.customButtons(btn2,"LOAD FILE","-fx-background-color:#abb2b9",
        ClassAbstract.font,Color.BLACK,ClassAbstract.border,
        100,100,300,50);
        Label lab1 = new Label();
        Functions.customLabels(lab1,"Choisir un corrigé de QCM au format CSV",450,110,font);
        //ActionEvent Button 2 : File-Chooser
        btn2.setOnAction(new EventHandler<ActionEvent>() {
                             @Override
                             public void handle(ActionEvent event) {
                                 File file = fileChooser.showOpenDialog(stage);
                                 if (file != null) {
                                     Results.filePathCorrection = file.getAbsolutePath();
                                     System.out.println("Chargement du fichier :" +Results.filePathCorrection +" effectué.");
                                     Results.openFile();
                             }
                         }
        });

        //Button 3
        btn3 = new Button("LOAD FOLDER");
        Functions.customButtons(btn3,"LOAD FOLDER","-fx-background-color:#abb2b9",
        ClassAbstract.font,Color.BLACK,ClassAbstract.border,
        100,200,300,50);
        Label lab2 = new Label();
        Functions.customLabels(lab2,"Choisir des copies de QCM au format CSV",450,210,font);
        //ActionEvent Button 3
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                List<File> fileList= fileChooser.showOpenMultipleDialog(stage);
                if (fileList != null) {

                    for (Results.index=0;Results.index<fileList.size();Results.index++) {
                        Results.temp.add(fileList.get(Results.index).getAbsolutePath());
                        Results.filePathCopy = fileList.get(Results.index).getAbsolutePath();
                        System.out.println("Chargement du fichier :" + Results.filePathCopy + " effectué.");
                        Results.openFile();
                        Results.initResults();

                    }
                    }
                    }
        });



        //Build Interface
        root1.getChildren().addAll(btn0,btn1,btn2,btn3,lab1,lab2);
        scene1 = new Scene(root1, h, l);
        scene1.setFill(Color.LIGHTGREY);
        return scene1;
        }

    public static Scene createSceneTwo() {
        root2 = new Group();

        //Button 4
        btn4 = new Button();
        Functions.customButtons(btn4,"MENU PRINCIPAL","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        100,500,150,50);
        btn4.setOnAction(event -> switchScenes(scene1));//scene2 => scene1

        //Button 7
        btn7 = new Button();
        Functions.customButtons(btn7,"STATS","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        440,500,150,50);
        btn7.setOnAction(event -> switchScenes(scene3));//scene2 => scene3

        //Button 5
        btn5 = new Button();
        Functions.customButtons(btn5,"PRECEDENT","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        620,500,150,50);

        //Button 6
        btn6 = new Button();
        Functions.customButtons(btn6,"SUIVANT","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        800,500,150,50);

        btn6.setOnAction(event -> Results.nextCopy());

        //scene2 Results

        root2.getChildren().addAll(btn4,btn7,btn5,btn6,stack1,stack2,stack3);
        scene2 = new Scene(root2, h, l);
        scene2.setFill(Color.LIGHTGREY);

    return scene2;
    }

    public static Scene createSceneThree() {
        root3 = new Group();

        btn9 = new Button();
        Functions.customButtons(btn9,"Barème","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        750,50,200,50);
        btn9.setOnAction(event ->stage.setScene(scene3));
        btn9.setOnAction(event -> System.out.println("Implémentation à venir"));

        btn10 = new Button();
        Functions.customButtons(btn10,"Moyenne","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        750,150,200,50);
        btn10.setOnAction(event ->stage.setScene(scene3));
        btn10.setOnAction(event -> System.out.println("Implémentation à venir"));

        btn11 = new Button();
        Functions.customButtons(btn11,"Détails","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        750,250,200,50);
        btn11.setOnAction(event ->stage.setScene(scene3));
        btn11.setOnAction(event -> System.out.println("Implémentation à venir"));

        btn12 = new Button();
        Functions.customButtons(btn12,"Sauvegarde","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        750,350,200,50);
        btn12.setOnAction(event ->stage.setScene(scene3));
        btn12.setOnAction(event -> System.out.println("Implémentation à venir"));

        btn13 = new Button();
        Functions.customButtons(btn13,"MENU PRINCIPAL","-fx-background-color:#abb2b9",font, Color.BLACK,border,
       100,500,200,50);
        btn13.setOnAction(event -> switchScenes(scene1));//scene3 =>scene1

        btn14 = new Button();
        Functions.customButtons(btn14,"CORRECTION","-fx-background-color:#abb2b9",font, Color.BLACK,border,
        400,500,200,50);
        btn14.setOnAction(event -> switchScenes(scene2));//scene3 => scene2

        // Bar Chart Graph
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<>(xAxis, yAxis);
        bc.setTitle("Distributions des notes");
        xAxis.setLabel("Notes");
        yAxis.setLabel("Fréquence");

        stack4.getChildren().add(bc);stack4.setLayoutX(50);stack4.setLayoutY(50);
        stack4.setBackground(background);stack4.setBorder(border);stack4.setMinSize(650,400);

        root3.getChildren().addAll(btn9,btn10,btn11,btn12,btn13,btn14,stack4);
        scene3 = new Scene(root3, h, l);
        scene3.setFill(Color.LIGHTGREY);

        return scene3;
    }

        //.CSV FILTER
        static FileChooser fileChooser = new FileChooser();{
        configuringFileChooser(fileChooser);}



    public static void main(String[] args) {
        Application.launch(args);
    }




}
