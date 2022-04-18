import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MyFonts {

    private Font font;
    private Font font6;

    public MyFonts(String name,FontWeight weight, int size){
        this.font = Font.font(name,weight,size);
    }

    public void setFont(String name,FontWeight weight, int size) {
        this.font = Font.font(name,weight,size);

    }

    public Font getFont() {
        return font;
    }


}
