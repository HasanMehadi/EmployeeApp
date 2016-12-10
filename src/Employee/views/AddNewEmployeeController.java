package Employee.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Calendar;

/**
 * Created by User on 12/9/2016.
 */
public class AddNewEmployeeController {

    /*contact Information*/

    public ObservableList<String> maritalobservableList = FXCollections.observableArrayList("Single", "Married", "Divorced", "widowed");

    public ObservableList<String> maindepartmentList = FXCollections.observableArrayList("Computer Science", "Electrical Engineering");

    public ObservableList<String> subDepartmentCSEList = FXCollections.observableArrayList("Software", "Database", "Testing", "Networking");

    public ObservableList<String> subDepartmentEEEList = FXCollections.observableArrayList("Hardware", "Maintenance", "Thermal", "Drone");

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
/*
    Employee Information*/

    @FXML
    private TextField id;

    @FXML
    private ComboBox department;

    @FXML
    private ComboBox subDepartment;

    @FXML
    public void initialize() {

        department.setValue("Computer Science");
        department.setItems(maindepartmentList);

        choiceBox.setValue("Single");
        choiceBox.setItems(maritalobservableList);

        subDepartment.setValue("Software");
        subDepartment.setItems(subDepartmentCSEList);

    }

    @FXML
    private void showAge() {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int birthday = (dob.getValue().getYear());

        int age = year - birthday;

        ageField.setText(Integer.toString(age) + " Years");

    }

    @FXML
    private void chooseSubDepartment() {
        if (department.getValue().equals("Computer Science")) {
            subDepartment.setValue("Software");
            subDepartment.setItems(subDepartmentCSEList);
        } else {
            subDepartment.setValue("Hardware");
            subDepartment.setItems(subDepartmentEEEList);
        }

    }
}
