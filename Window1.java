import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;


public class Window1 extends Application {

    private Stage stage;
    protected Scene scene1;
    private Group root1;
    protected Scene scene2;
    public Group root2;
    private Scene scene3;
    private Group root3;
    int width = 600;
    int height = 1000;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;

    String[][] tabl1 = new String[][]{
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
    };


    //Buttons style
    Font font = Font.font("Courrier New", FontWeight.BOLD,20);
    BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2));
    Border border = new Border(borderStroke);

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        scene1 = createSceneOne();
        scene2 = createSceneTwo();
        scene3 = createSceneThree();
        stage.setScene(scene1);
        stage.show();
    }


    private Scene createSceneOne() {
        root1 = new Group();
        Canvas canvas = new Canvas(width,height);
        root1.getChildren().add(canvas);

        //Button 0
        btn0 = new Button("CORRECTION");
        btn0.setOnAction(event ->stage.setScene(scene2));
        btn0.setMinSize(300, 50);
        btn0.setStyle("-fx-background-color:      #abb2b9     ");
        btn0.setFont(font);
        btn0.setTextFill(Color.BLACK);
        btn0.setLayoutX(350);
        btn0.setLayoutY(400);
        btn0.setBorder(border);

        //Button 1
        btn1 = new Button("STATISTIQUES");
        btn1.setMinSize(300,50);
        btn1.setStyle("-fx-background-color:      #abb2b9     ");
        btn1.setFont(font);
        btn1.setTextFill(Color.BLACK);
        btn1.setLayoutX(350);
        btn1.setLayoutY(500);
        btn1.setBorder(border);

        //ActionEvent Button 1
        btn1.setOnAction(event ->switchScenes(scene3));

        //Button 2
        btn2 = new Button("LOAD FILE");
        btn2.setMinSize(300,50);
        btn2.setStyle("-fx-background-color:      #abb2b9    ");
        btn2.setFont(font);
        btn2.setTextFill(Color.BLACK);
        btn2.setLayoutX(100);
        btn2.setLayoutY(100);
        btn2.setBorder(border);

        //ActionEvent Button 2
        btn2.setOnAction(event -> {
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                openFile();}
        });

        //Button 3
        btn3 = new Button("LOAD FOLDER");
        btn3.setMinSize(300,50);
        btn3.setStyle("-fx-background-color:      #abb2b9     ");
        btn3.setFont(font);
        btn3.setTextFill(Color.BLACK);
        btn3.setLayoutX(100);
        btn3.setLayoutY(200);
        btn3.setBorder(border);

        //ActionEvent Button 3
        btn3.setOnAction(event -> fileChooser.showOpenMultipleDialog(stage));

        //Build Interface
        root1.getChildren().addAll(btn0,btn1,btn2,btn3);
        scene1 = new Scene(root1, height, width);
        scene1.setFill(Color.LIGHTGREY);
        return scene1;
        }

    private Scene createSceneTwo() {
        root2 = new Group();

        //Button 4
        btn4 = new Button("MENU PRINCIPAL");
        btn4.setMinSize(150,50);
        btn4.setStyle("-fx-background-color:      #abb2b9    ");
        btn4.setFont(font);
        btn4.setTextFill(Color.BLACK);
        btn4.setLayoutX(100);
        btn4.setLayoutY(500);
        btn4.setBorder(border);
        btn4.setOnAction(event -> switchScenes(scene1)); //--> MENU P

        //Button 7
        btn7 = new Button("STATS");
        btn7.setMinSize(150,50);
        btn7.setStyle("-fx-background-color:      #abb2b9     ");
        btn7.setFont(font);
        btn7.setTextFill(Color.BLACK);
        btn7.setLayoutX(450);
        btn7.setLayoutY(500);
        btn7.setBorder(border);
        btn7.setOnAction(event -> switchScenes(scene3));

        //Button 5
        btn5 = new Button("PRECEDENT");
        btn5.setMinSize(150,50);
        btn5.setStyle("-fx-background-color:      #abb2b9    ");
        btn5.setFont(font);
        btn5.setTextFill(Color.BLACK);
        btn5.setLayoutX(620);
        btn5.setLayoutY(500);
        btn5.setBorder(border);

        //Button 6
        btn6 = new Button("SUIVANT");
        btn6.setMinSize(150,50);
        btn6.setStyle("-fx-background-color:      #abb2b9    ");
        btn6.setFont(font);
        btn6.setTextFill(Color.BLACK);
        btn6.setLayoutX(800);
        btn6.setLayoutY(500);
        btn6.setBorder(border);

        //Button 8
        btn8 = new Button("voir Correction copie");
        btn8.setMinSize(150,50);
        btn8.setStyle("-fx-background-color:      #abb2b9    ");
        btn8.setFont(font);
        btn8.setTextFill(Color.BLACK);
        btn8.setLayoutX(300);
        btn8.setLayoutY(300);
        btn8.setBorder(border);
        btn8.setOnAction(event -> System.out.println(Program.comparer(tabl1,tabl2))); // Correction dans console


        root2.getChildren().addAll(btn4,btn7,btn5,btn6,btn8);
        scene2 = new Scene(root2, height, width);
        scene2.setFill(Color.LIGHTGREY);

    return scene2;
    }

    private Scene createSceneThree() {
        root3 = new Group();

        btn9 = new Button("Barème");
        btn9.setOnAction(event ->stage.setScene(scene3));
        btn9.setMinSize(200, 50);
        btn9.setStyle("-fx-background-color:      #abb2b9     ");
        btn9.setFont(font);
        btn9.setTextFill(Color.BLACK);
        btn9.setLayoutX(750);
        btn9.setLayoutY(50);
        btn9.setBorder(border);

        btn10 = new Button("Moyenne");
        btn10.setOnAction(event ->stage.setScene(scene3));
        btn10.setMinSize(200, 50);
        btn10.setStyle("-fx-background-color:      #abb2b9     ");
        btn10.setFont(font);
        btn10.setTextFill(Color.BLACK);
        btn10.setLayoutX(750);
        btn10.setLayoutY(150);
        btn10.setBorder(border);

        btn11 = new Button("Détails");
        btn11.setOnAction(event ->stage.setScene(scene3));
        btn11.setMinSize(200, 50);
        btn11.setStyle("-fx-background-color:      #abb2b9     ");
        btn11.setFont(font);
        btn11.setTextFill(Color.BLACK);
        btn11.setLayoutX(750);
        btn11.setLayoutY(250);
        btn11.setBorder(border);

        btn12 = new Button("Sauvegarde");
        btn12.setOnAction(event ->stage.setScene(scene3));
        btn12.setMinSize(200, 50);
        btn12.setStyle("-fx-background-color:      #abb2b9     ");
        btn12.setFont(font);
        btn12.setTextFill(Color.BLACK);
        btn12.setLayoutX(750);
        btn12.setLayoutY(350);
        btn12.setBorder(border);


        btn13 = new Button("MENU PRINCIPAL");
        btn13.setMinSize(200,50);
        btn13.setStyle("-fx-background-color:      #abb2b9    ");
        btn13.setFont(font);
        btn13.setTextFill(Color.BLACK);
        btn13.setLayoutX(100);
        btn13.setLayoutY(500);
        btn13.setBorder(border);
        btn13.setOnAction(event -> switchScenes(scene1));


        root3.getChildren().addAll(btn9,btn10,btn11,btn12,btn13);
        scene3 = new Scene(root3, height, width);
        scene3.setFill(Color.LIGHTGREY);

        return scene3;
    }

        //.CSV FILTER
        FileChooser fileChooser = new FileChooser();{
        configuringFileChooser(fileChooser);}

    private void configuringFileChooser(FileChooser fileChooser) {

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));

    }

    public void switchScenes (Scene scene) {
        stage.setScene (scene);
    }


    private void openFile() {} // Files LOADER

    public static void main(String[] args) {
        Application.launch(args);
    }

}