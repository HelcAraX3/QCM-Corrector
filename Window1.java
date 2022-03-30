import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;


public class Window1 extends Application {


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



    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Correcteur de QCM");
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 600);

        //Background style
        Canvas canvas = new Canvas(1000, 600);
        StackPane holder = new StackPane();
        holder.getChildren().add(canvas);
        holder.setStyle("-fx-background-color:   #eaecee  ");

        //Buttons style
        Font font = Font.font("Courrier New", FontWeight.BOLD,20);
        BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2));
        Border border = new Border(borderStroke);


        //CSV loader
        FileChooser fileChooser = new FileChooser();
        configuringFileChooser(fileChooser);


        //Button0 CORRECTION
        Button btn0 = new Button();
            btn0.setFont(font);
            btn0.setLayoutX(350);
            btn0.setLayoutY(400);btn0.setMinSize(300,50);
            btn0.setStyle("-fx-background-color:      #abb2b9     ");
            btn0.setBorder(border);
            btn0.setAlignment(Pos.CENTER);
            btn0.setText(" CORRECTION ");
            btn0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Label secondLabel = new Label("Action sur bouton1");

                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);

                Scene secondScene = new Scene(secondaryLayout, 900, 500);

                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Correction QCM");
                newWindow.setScene(secondScene);

                // Set position of second window, related to primary window.
                newWindow.setX(primaryStage.getX() + 200);
                newWindow.setY(primaryStage.getY() + 100);
                Program.comparer(tabl1,tabl2);
                newWindow.show();
            }
        });

        //Button1 STATISTIQUES
        Button btn1 = new Button();
            btn1.setFont(font);
            btn1.setLayoutX(350);
            btn1.setLayoutY(500);
            btn1.setMinSize(300,50);
            btn1.setStyle("-fx-background-color:      #abb2b9     ");
            btn1.setBorder(border);
            btn1.setAlignment(Pos.CENTER);
            btn1.setText("STATISTIQUES");
            btn1.setOnAction(event -> System.out.println("Statistiques à venir"));

        //Button2 LOAD FILES
        Button btn2 = new Button();
            btn2.setFont(font);
            btn2.setLayoutX(100);
            btn2.setLayoutY(100);
            btn2.setMinSize(300,50);
            btn2.setStyle("-fx-background-color:      #abb2b9    ");
            btn2.setBorder(border);
            btn2.setAlignment(Pos.CENTER);
            btn2.setText("LOAD FILE");
            btn2.setOnAction(event -> {
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                openFile();}

        });

        //Button3 LOAD DIRECTORY
        Button btn3 = new Button();
            btn3.setFont(font);
            btn3.setLayoutX(100);
            btn3.setLayoutY(200);
            btn3.setMinSize(300,50);
            btn3.setStyle("-fx-background-color:      #abb2b9     ");
            btn3.setBorder(border);
            btn3.setAlignment(Pos.CENTER);
            btn3.setText("LOAD DIRECTORY");
            btn3.setOnAction(event -> fileChooser.showOpenMultipleDialog(primaryStage));

        //BUILD INTERFACE
        root.getChildren().add(holder);
        root.getChildren().add(btn0);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void configuringFileChooser(FileChooser fileChooser) {

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
    } //CSV FILTER

    private void openFile() {} // Files LOADER

}