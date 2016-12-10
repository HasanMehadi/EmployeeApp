package Employee.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.Calendar;

/**
 * Created by User on 12/9/2016.
 */
public class AddNewEmployeeController {

    /*contact Information*/

    public ObservableList<String> maritalobservableList = FXCollections.observableArrayList("Single","Married","Divorced","widowed");

    @FXML
    private TextField nameField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField cityField;

    /*personal Information */

    @FXML
    private DatePicker dob;

    @FXML
    private TextField ageField;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private RadioButton maleBtn;

    @FXML
    private RadioButton femaleBtn;

    @FXML
    private RadioButton noneBtn;

    @FXML
    public void initialize (){
        choiceBox.setItems(maritalobservableList);
        choiceBox.setValue("Add List");
    }

    @FXML
    private void showAge(){

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int birthday = (dob.getValue().getYear());

        int age = year-birthday;

        ageField.setText(Integer.toString(age)+" Years");

    }
}
