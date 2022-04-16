import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

public abstract class ClassAbstract extends Application {

    static Stage stage;
    protected static Scene scene1;
    protected static Group root1;
    protected static Scene scene2;
    protected static Group root2;
    protected static Scene scene3;
    protected static Group root3;
    static int l = 600;
    static int h = 1000;
    protected static Button btn0;
    protected static Button btn1;
    protected static Button btn2;
    protected static Button btn3;
    protected static Button btn4;
    protected static Button btn5;
    protected static Button btn6;
    protected static Button btn7;
    protected static Button btn9;
    protected static Button btn10;
    protected static Button btn11;
    protected static Button btn12;
    protected static Button btn13;
    protected static Button btn14;


    //Styles used in Main
    static Font font = Font.font("Courrier New", FontWeight.BOLD,20);
    static Font font1 = Font.font("Courrier New", FontWeight.BOLD,12);
    Font font2 = Font.font("Courrier New", FontWeight.BOLD,12);
    static BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2));
    static Background background = new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY));
    static Border border = new Border(borderStroke);
    //Rectangle rect1 = new Rectangle(300,300,Color.WHITE);
    //Rectangle rect2 = new Rectangle(300,300,Color.WHITE);
    static StackPane stack1 = new StackPane();
    static StackPane stack2 = new StackPane();
    static StackPane stack3 = new StackPane();
    static StackPane stack4 = new StackPane();
    public  static Desktop desktop = Desktop.getDesktop();

    //Function switchScenes
    public static void switchScenes(Scene scene) {
        stage.setScene (scene);
    }
    //Function CSV Filter
    protected void configuringFileChooser(FileChooser fileChooser) {

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
    }


}
