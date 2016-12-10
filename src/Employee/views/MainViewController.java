package Employee.views;

import Employee.Main;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Created by User on 12/8/2016.
 */
public class MainViewController {

    public Main main = new Main();

    @FXML
    public void goHome() throws IOException{

        main.showMainItems();
    }

    public void addNewEmployee() throws IOException{

        main.addNewEmployee();

    }

}
