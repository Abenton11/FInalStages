package com.example.templatemodule2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {

    @FXML
    private TextField userTextBox;
    @FXML
    private TextField passTextBox;
    @FXML
    private Button logButton;


    @FXML
    protected void passMouseEnter()
    {

           // passTextBox.setText("");

    }
    @FXML
    protected void passMouseExit()
    {
        if(passTextBox.getText() == "") {
        passTextBox.setText("Password");
        }
    }

    @FXML
    protected void userMouseEnter()
    {
        //userTextBox.setText("");
    }
    @FXML
    protected void userMouseExit()
    {
        if (userTextBox.getText() == "") {
            userTextBox.setText("Username");
        }
    }



    @FXML
    protected void loginButtonPushed() throws IOException {

        if (userTextBox.getText().equals("A") && passTextBox.getText().equals("1234"))
        {
            main.userType = 'a';
            Stage currentStage = (Stage) userTextBox.getScene().getWindow();
            main.switchScene(currentStage, "facuiltyManagment");
        }

        for (int i = 0; i < main.students.length; i++)
        {
                if (userTextBox.getText().equals(main.students[i].getName()) && passTextBox.getText().equals(main.students[i].password)) {
                    main.userType = 's';
                    main.currentStudent = main.students[i];
                    Stage currentStage = (Stage) userTextBox.getScene().getWindow();
                    main.switchScene(currentStage, "facuiltyManagment");
                }
        }

        for (int i = 0; i < main.facuilties.length; i++)
        {
            if (userTextBox.getText().equals(main.facuilties[i].getName()) && passTextBox.getText().equals(main.facuilties[i].password))
            {
                main.userType = 'f';
                main.currentFac = main.facuilties[i];
                Stage currentStage = (Stage) userTextBox.getScene().getWindow();
                main.switchScene(currentStage, "facuiltyManagment");
            }
        }
    }
    @FXML
    protected void onPassAction(){}

    @FXML
    protected  void onUserMouseClick()
    {
        userTextBox.setText("");
    }
    @FXML
    protected  void onPassMouseClicked()
    {
        passTextBox.setText("");
    }
}
