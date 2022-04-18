package AppGui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Functions {

    public static void customButtons(Button btn,String nameBtn, String style,
    Font font, Color color, Border border, double layX, double layY, double minWidth, double minHeigth) {
        btn.setText(nameBtn);
        btn.setStyle(style);
        btn.setFont(font);
        btn.setBorder(border);
        btn.setTextFill(color);
        btn.setLayoutX(layX);
        btn.setLayoutY(layY);
        btn.setMinSize(minWidth,minHeigth);

    }

    public static void customLabels(Label label, String name, double layX, double layY, Font font){
        label.setLayoutX(layX);
        label.setLayoutY(layY);
        label.setFont(font);
    }

    public static void customTexts(Text text, double layX, double layY, Font font, double wrap, Paint color){
        text.setLayoutX(layX);
        text.setLayoutY(layY);
        text.setFont(font);
        text.setWrappingWidth(wrap);
        text.setFill(color);
    }

    public static void customStacks(StackPane stack, double layX, double layY, Border border,
    double minWidth, double minHeigth, Background backG){
        stack.setLayoutX(layX);
        stack.setLayoutY(layY);
        stack.setBorder(border);
        stack.setMinSize(minWidth,minHeigth);
        stack.setBackground(backG);
    }




}
