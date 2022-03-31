import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public abstract class ClasseAbstraite  extends Application {

    protected Stage stage;
    protected Scene scene1;
    protected Group root1;
    protected Scene scene2;
    protected Group root2;
    protected Scene scene3;
    protected Group root3;
    int l = 600;
    int h = 1000;
    protected Button btn0;
    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btn10;
    protected Button btn11;
    protected Button btn12;
    protected Button btn13;




    // TestCSV d'exemple de QCM
    // copie
    String[][] tabl1 = new String[][]{
            {"1","A","B"," "," "," "},
            {"2"," ","B"," ","D"," "},
            {"3"," ","B","C"," "," "},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"}
    };
    //corrigé
    String[][] tabl2 = new String[][]{
            {"1"," ","B"," ","D"," "},
            {"2"," "," "," ","D"," "},
            {"3"," ","B","C"," "," "},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"},
            {"4"," "," "," "," ","E"}
    };

    //Style
    Font font = Font.font("Courrier New", FontWeight.BOLD,20);
    Font font1 = Font.font("Courrier New", FontWeight.BOLD,12);
    Font font2 = Font.font("Courrier New", FontWeight.BOLD,12);
    BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2));
    Background background = new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY));
    Border border = new Border(borderStroke);
    //Rectangle rect1 = new Rectangle(300,300,Color.WHITE);
    //Rectangle rect2 = new Rectangle(300,300,Color.WHITE);
    StackPane stack1 = new StackPane();
    StackPane stack2 = new StackPane();
    StackPane stack3 = new StackPane();

    public void switchScenes (Scene scene) {
        stage.setScene (scene);
    }

    protected void configuringFileChooser(FileChooser fileChooser) {

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));

    }

    protected void openFile() {} // Files LOADER
}
