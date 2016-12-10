package Employee;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;


public class Main extends Application {

    private static  Stage window;
    private static BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Employee Application");

        showMainView();
        showMainItems();

    }

    public static void main(String[] args) {
        launch(args);
    }

    private void showMainView() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/MainView.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        window.setScene(scene);
        window.show();
    }

    public static void showMainItems() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/MainItems.fxml"));

        BorderPane layout = loader.load();
        mainLayout.setCenter(layout);


    }

    public static void showEEEDept() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("EEEDept/EEEDeptView.fxml"));

        BorderPane eeeDept = loader.load();
        mainLayout.setCenter(eeeDept);
    }

    public static void showCSEDept() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("CSEDept/CSEDeptView.fxml"));

        BorderPane eeeDept = loader.load();
        mainLayout.setCenter(eeeDept);
    }

    public static void addNewEmployee() throws  IOException{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/AddNewEmployee.fxml"));
        BorderPane layout = loader.load();

        Stage addDialogue = new Stage();
        addDialogue.setTitle("Add Employee");
        addDialogue.initModality(Modality.WINDOW_MODAL);
        addDialogue.initOwner(window);

        Scene scene = new Scene(layout);
        addDialogue.setScene(scene);
        addDialogue.showAndWait();
    }
}
