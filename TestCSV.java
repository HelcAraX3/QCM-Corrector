import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestCSV extends ClasseAbstraite {
    public static class Record {
        //Assume each record have 6 elements, all String
        private final SimpleStringProperty f1, f2, f3, f4, f5, f6;
        public String getF1() {
            return f1.get();
        }
        public String getF2() {
            return f2.get();
        }
        public String getF3() {
            return f3.get();
        }
        public String getF4() {
            return f4.get();
        }
        public String getF5() {
            return f5.get();
        }
        public String getF6() {
            return f6.get();
        }
        Record(String f1, String f2, String f3, String f4,
               String f5, String f6) {
            this.f1 = new SimpleStringProperty(f1);
            this.f2 = new SimpleStringProperty(f2);
            this.f3 = new SimpleStringProperty(f3);
            this.f4 = new SimpleStringProperty(f4);
            this.f5 = new SimpleStringProperty(f5);
            this.f6 = new SimpleStringProperty(f6);
        }

    }
    private final TableView<Record> tableView = new TableView<>();
    private final ObservableList<Record> dataList
            = FXCollections.observableArrayList();
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Copie du QCM");
        Group root = new Group();
        TableColumn columnF1 = new TableColumn("f1");
        columnF1.setCellValueFactory(
                new PropertyValueFactory<>("f1"));
        TableColumn columnF2 = new TableColumn("f2");
        columnF2.setCellValueFactory(
                new PropertyValueFactory<>("f2"));
        TableColumn columnF3 = new TableColumn("f3");
        columnF3.setCellValueFactory(
                new PropertyValueFactory<>("f3"));
        TableColumn columnF4 = new TableColumn("f4");
        columnF4.setCellValueFactory(
                new PropertyValueFactory<>("f4"));
        TableColumn columnF5 = new TableColumn("f5");
        columnF5.setCellValueFactory(
                new PropertyValueFactory<>("f5"));
        TableColumn columnF6 = new TableColumn("f6");
        columnF6.setCellValueFactory(
                new PropertyValueFactory<>("f6"));
        tableView.setItems(dataList);
        tableView.getColumns().addAll(
                columnF1, columnF2, columnF3, columnF4, columnF5, columnF6);
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.getChildren().add(tableView);
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root,600,250));
        primaryStage.show();
        readCSV();
    }
    protected void readCSV() {
        String CsvFile = "CopieTest.csv";
        String FieldDelimiter = ",";
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter,0);
                Record record = new Record(fields[0], fields[1], fields[2],
                        fields[3], fields[4], fields[5]);
                dataList.add(record);
            }
        }  catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}