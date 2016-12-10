package Employee.views;

import Employee.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by User on 12/7/2016.
 */

public class MainItemsController {


    public Main main = new Main();

    @FXML
    public void goEEEDept() throws IOException {
        main.showEEEDept();

    }

    @FXML
    public void goCSEDept() throws IOException{

        main.showCSEDept();
    }


}
