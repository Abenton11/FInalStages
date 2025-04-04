package com.example.templatemodule2;


import com.example.templatemodule2.facuilty;
import com.example.templatemodule2.search;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.*;
import javax.swing.filechooser.*;

import javafx.scene.image.ImageView;


public class facuiltyController implements Initializable {
    search searcher = new search();
    facuilty[] indexList = new facuilty[14];
    int searchMode = 0; //0 for fac 1 for student
    int currentFacIndex;
    boolean firstEntry = false;
    @FXML
    public Label userTypeLabel;
    @FXML
    public Label subLabel;
    @FXML
    public TextField searchTextField;
    @FXML
    public Label labelOne;
    @FXML
    public Label labelTwo;
    @FXML
    public Label labelThree;
    @FXML
    public Label labelFour;
    @FXML
    public Label labelFive;
    @FXML
    public Label labelSix;
    @FXML
    public Label labelSeven;
    @FXML
    public Label labelEight;
    @FXML
    public Label labelNine;
    @FXML
    public Label labelTen;
    @FXML
    public Label labelEleven;
    @FXML
    public Label labelTweleve;
    @FXML
    public Label labelThirteen;
    @FXML
    public Label labelFourteen;
    @FXML
    public Parent group;
    @FXML
    public Button searchButton;
    @FXML
    public Button editButton;
    @FXML
    public TextField nameBox;
    @FXML
    public TextField degreeBox;
    @FXML
    public TextField researchBox;
    @FXML
    public TextField expertiseBox;
    @FXML
    public TextField coursesOfferedBox;
    @FXML
    public TextField emailBox;
    @FXML
    public TextField officeLocationBox;
    @FXML
    public Label name2Label;
    @FXML
    public Label degreeLabel;
    @FXML
    public Label researchLabel;
    @FXML
    public Label expertiseLabel;
    @FXML
    public Label coursesLabel;
    @FXML
    public Label emailLabel;
    @FXML
    public Label officeLabel;
    @FXML
    public Label studentsLabel;
    @FXML
    public Parent feildsGroup;
    @FXML
    public Button changeImageButton;
    @FXML
    public Button addButton;
    @FXML
    public ImageView imageBox;
    @FXML
    public TextField passTextBox;
    @FXML
    public MenuItem facuiltyListButton;
    @FXML
    public MenuItem studentListButton;


    String tempImagePath = new String();











    @FXML
    public Label[] infoList = new Label[14];


    public facuiltyController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        infoList[0] = labelOne;
        infoList[1] = labelTwo;
        infoList[2] = labelThree;
        infoList[3] = labelFour;
        infoList[4] = labelFive;
        infoList[5] = labelSix;
        infoList[6] = labelSeven;
        infoList[7] = labelEight;
        infoList[8] = labelNine;
        infoList[9] = labelTen;
        infoList[10] = labelEleven;
        infoList[11] = labelTweleve;
        infoList[12] = labelThirteen;
        infoList[13] = labelFourteen;

        for (int i = 0; i < 14; i++)
        {
            infoList[i].setText(i + "");
        }

        if (main.userType == 's')
        {
            facuiltyListButton.setVisible(true);
            studentListButton.setVisible(false);
        }
        else if (main.userType == 'f')
        {
            facuiltyListButton.setVisible(true);
            studentListButton.setVisible(true);
        }
        else if (main.userType == 'a')
        {
            facuiltyListButton.setVisible(true);
            studentListButton.setVisible(true);
        }

        //region testing
        //region visability
        subLabel.setLayoutX(176);
        subLabel.setLayoutY(132);
        searchTextField.setVisible(true);
        searchButton.setVisible(true);
        group.setVisible(true);
        subLabel.setText("Facuilty List");
        editButton.setVisible(false);
        feildsGroup.setVisible(false);
        addButton.setText("Add");
        //endregion

        for (int i = 0; i < 14; i++) {
            indexList[i] = main.facuilties[i];
            if (main.facuilties[i].getName().equals("")) {
                infoList[i].setText("");
            } else {
                infoList[i].setText("Name: " + main.facuilties[i].getName() + " Degree: " + main.facuilties[i].degree + "  Office Location: " + main.facuilties[i].officeLocation + "    Email: " + main.facuilties[i].getEmail());
            }
        }
        searchMode = 0;


        //region visability
        subLabel.setLayoutX(176);
        subLabel.setLayoutY(132);
        searchTextField.setVisible(true);
        searchButton.setVisible(true);
        group.setVisible(true);
        subLabel.setText("Facuilty List");
        editButton.setVisible(true);
        feildsGroup.setVisible(false);
        addButton.setText("Add");
        //endregion

        for (int i = 0; i < 14; i++) {
            if (main.facuilties[i].getName().equals("")) {
                infoList[i].setText("");
            } else {
                infoList[i].setText("Name: " + main.facuilties[i].getName() +  "  Office Location: " + main.facuilties[i].officeLocation + "    Email: " + main.facuilties[i].getEmail() + "  Research: " + main.facuilties[i].researchInterest);
            }
        }
        searchMode = 0;
        //endregion


        if (main.userType == 's')
        {
            userTypeLabel.setText("STUDENT");
        }
        else if (main.userType == 'f')
        {
            userTypeLabel.setText("FACUILTY");
        }
        else if (main.userType == 'a')
        {
            userTypeLabel.setText("ADMIN");
        }

    }


    @FXML
    protected void onSubjectManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "subjectManagment");
    }
    @FXML
    protected void onCourseManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "courseManagment");
    }
    @FXML
    protected void onStudentManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "studentManagment");
    }
    @FXML
    protected void onFacuiltyManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "facuiltyManagment");
    }
    @FXML
    protected void onEventManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "eventManagment");
    }

    @FXML
    protected void onFeatureButtonOne()
    {
        userTypeLabel.setText("hello");
    }

    @FXML
    protected void onSearchButton()
    {
        facuilty f = new facuilty();
        int indexCounter = 0;

        for (int i = 0; i < indexList.length; i++)
        {
            indexList[i] = f;
        }
       /* String[] newString = new String[main.facuilties.length];
        String[] placeString = new String[main.facuilties.length];
        for(int i = 0; i < main.facuilties.length; i++)
        {
            indexList[i] = main.facuilties[i];
            placeString[i] = main.facuilties[i].getName();
        }*/

        for (int i = 0; i < main.facuilties.length; i++)
        {
            if(main.facuilties[i].name.contains(searchTextField.getText()))
            {
                indexList[indexCounter] = main.facuilties[i];
                indexCounter++;
            }
        }

        for (int i = 0; i < infoList.length; i++)
        {
            if (indexList[i] != null) {
                infoList[i].setText(indexList[i].getName());
            }
        }

        indexCounter = 0;
    }
    @FXML
    protected void onFacuiltyListButton()
    {
            //region visability
            subLabel.setLayoutX(176);
            subLabel.setLayoutY(132);
            searchTextField.setVisible(true);
            searchButton.setVisible(true);
            group.setVisible(true);
            subLabel.setText("Facuilty List");
            editButton.setVisible(false);
            feildsGroup.setVisible(false);
            addButton.setText("Add");
            //endregion

            for (int i = 0; i < 14; i++) {
                indexList[i] = main.facuilties[i];
                if (main.facuilties[i].getName().equals("")) {
                    infoList[i].setText("");
                } else {
                    infoList[i].setText("Name: " + main.facuilties[i].getName() + " Degree: " + main.facuilties[i].degree + "  Office Location: " + main.facuilties[i].officeLocation + "    Email: " + main.facuilties[i].getEmail());
                }
            }
            searchMode = 0;


            //region visability
            subLabel.setLayoutX(176);
            subLabel.setLayoutY(132);
            searchTextField.setVisible(true);
            searchButton.setVisible(true);
            group.setVisible(true);
            subLabel.setText("Facuilty List");
            editButton.setVisible(false);
            feildsGroup.setVisible(false);
            addButton.setText("Add");
            //endregion

            for (int i = 0; i < 14; i++) {
                if (main.facuilties[i].getName().equals("")) {
                    infoList[i].setText("");
                } else {
                    infoList[i].setText("Name: " + main.facuilties[i].getName() +  "  Office Location: " + main.facuilties[i].officeLocation + "    Email: " + main.facuilties[i].getEmail() + "  Research: " + main.facuilties[i].researchInterest);
                }
            }
            searchMode = 0;

    }


    @FXML
    protected void onStudentListButton()
    {
        //region visability
        subLabel.setLayoutX(387);
        subLabel.setLayoutY(145);
        searchTextField.setVisible(false);
        searchButton.setVisible(false);
        group.setVisible(false);
        subLabel.setText("Add Facuilty");
        editButton.setVisible(false);
        feildsGroup.setVisible(true);
        //endregion
    }

    @FXML
    protected void onChangeImageButton() throws IOException {
        JFileChooser fileChoose = new JFileChooser();
        fileChoose.showOpenDialog(null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChoose.setFileFilter(filter);
        File f =  fileChoose.getSelectedFile();
        String s = new String();
        s = f.getAbsolutePath();
        Image image  = new Image(s);
        imageBox.setImage(image);
        tempImagePath = s;
    }

    @FXML
    protected void onAddButton()
    {
        if (addButton.getText().equals("Add")) {
            facuilty f = new facuilty();
            f.facID = "F000" + facuilty.facCounter;

            f.setName(nameBox.getText());
            nameBox.setText("");

            f.researchInterest = researchBox.getText();
            researchBox.setText("");

            f.degree = degreeBox.getText();
            degreeBox.setText("");

            f.officeLocation = officeLocationBox.getText();
            officeLocationBox.setText("");

            f.setEmail(emailBox.getText());
            emailBox.setText("");

            f.password = passTextBox.getText();
            passTextBox.setText("");
            /*
            String s = new String();
            String sArray[] = new String[10];
            for (int i = 0; i < sArray.length; i++) {
                sArray[i] = "";
            }

            int sCount = 0;
            int lastIndex = 0;
            s = coursesOfferedBox.getText();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ',') {
                    sArray[sCount] = "";
                    for (int j = lastIndex; j < i; j++) {
                        sArray[sCount] += s.charAt(j) + "";
                    }
                    sCount++;
                    lastIndex = i + 1;
                }
            }
            f.intital();
            for (int i = 0; i < sArray.length; i++) {
                for (int j = 0; j < main.courses.length; j++) {
                    if (sArray[i].equals(main.courses[j].name)) {
                        f.coursesOffered[f.courseCounter] = main.courses[j];
                        break;
                    }
                }
            }*/
            for (int i = 0; i < main.courses.length; i++)
            {
                if (main.courses[i].name.equals(coursesOfferedBox.getText()))
                {
                    f.courseOffered = main.courses[i];
                }
            }
            coursesOfferedBox.setText("");
            main.facuilties[facuilty.facCounter] = f;
            facuilty.facCounter++;
        }
        else if (addButton.getText().equals("Save"))
        {
            boolean place = false;
            if (main.currentFac == main.facuilties[currentFacIndex])
            {
                place = true;
            }
            int index = currentFacIndex;
            facuilty f = new facuilty();

            f.setName(nameBox.getText());
            nameBox.setText("");

            f.researchInterest = researchBox.getText();
            researchBox.setText("");

            f.degree = degreeBox.getText();
            degreeBox.setText("");

            f.officeLocation = officeLocationBox.getText();
            officeLocationBox.setText("");

            f.setEmail(emailBox.getText());
            emailBox.setText("");

            f.password = passTextBox.getText();
            passTextBox.setText("");

            /*
            String s = new String();
            String sArray[] = new String[10];
            for (int i = 0; i < sArray.length; i++) {
                sArray[i] = "";
            }

            int sCount = 0;
            int lastIndex = 0;
            s = coursesOfferedBox.getText();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ',') {
                    sArray[sCount] = "";
                    for (int j = lastIndex; j < i; j++) {
                        sArray[sCount] += s.charAt(j) + "";
                    }
                    sCount++;
                    lastIndex = i + 1;
                }
            }
            f.intital();
            for (int i = 0; i < sArray.length; i++) {
                for (int j = 0; j < main.courses.length; j++) {
                    if (sArray[i].equals(main.courses[j].name)) {
                        f.coursesOffered[f.courseCounter] = main.courses[j];
                        break;
                    }
                }
            }*/

            for (int i = 0; i < main.courses.length; i++)
            {
                if (main.courses[i].name.equals(coursesOfferedBox.getText()))
                {
                    f.courseOffered = main.courses[i];
                }
            }
            coursesOfferedBox.setText("");

            if (place == true)
            {
                main.currentFac = f;
            }

            main.facuilties[currentFacIndex] = f;
            indexList[currentFacIndex] = f;
        }
    }

    //region editLabels
    public void onlabelOne()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[0]) {
                fillFeilds(main.facuilties[0]);
                currentFacIndex = 0;
                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelTwo()
    {
        if (infoList[0].equals(""))
        {

        }else {if (main.userType == 'a' || main.currentFac == indexList[1]) {

            subLabel.setLayoutX(387);
            subLabel.setLayoutY(145);
            searchTextField.setVisible(false);
            searchButton.setVisible(false);
            group.setVisible(false);
            subLabel.setText("Edit Facuilty");
            editButton.setVisible(false);
            feildsGroup.setVisible(true);
            addButton.setText("Save");

            currentFacIndex = 1;
            fillFeilds(indexList[1]);
        }
        }
    }
    public void onlabelThree()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[2]) {


                currentFacIndex = 2;
                fillFeilds(indexList[2]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelFour()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[3]) {
                currentFacIndex = 3;
                fillFeilds(indexList[3]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelFive()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[4]) {
                currentFacIndex = 4;
                fillFeilds(indexList[4]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelSix()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[5]) {
                currentFacIndex = 5;
                fillFeilds(indexList[5]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelSeven()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[6]) {
                currentFacIndex = 6;
                fillFeilds(indexList[6]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelEight()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[7]) {
                currentFacIndex = 7;
                fillFeilds(indexList[7]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    } public void onlabelNine()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[8]) {
                currentFacIndex = 8;
                fillFeilds(indexList[8]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelTen()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[9]) {
                currentFacIndex = 9;
                fillFeilds(indexList[9]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelEleven()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[10]) {
                currentFacIndex = 10;
                fillFeilds(indexList[10]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelTwelve()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[11]) {
                currentFacIndex = 11;
                fillFeilds(indexList[11]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }
    public void onlabelThirteen()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[12]) {
                currentFacIndex = 12;
                fillFeilds(indexList[12]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }public void onlabelFourteen()
    {
        if (infoList[0].equals(""))
        {

        }else {
            if (main.userType == 'a' || main.currentFac == indexList[13]) {
                currentFacIndex = 13;
                fillFeilds(indexList[13]);

                subLabel.setLayoutX(387);
                subLabel.setLayoutY(145);
                searchTextField.setVisible(false);
                searchButton.setVisible(false);
                group.setVisible(false);
                subLabel.setText("Edit Facuilty");
                editButton.setVisible(false);
                feildsGroup.setVisible(true);
                addButton.setText("Save");
            }
        }
    }

    //endregion

    public void fillFeilds(facuilty f)
    {
        nameBox.setText(f.getName());

        researchBox.setText(f.researchInterest);

        degreeBox.setText(f.degree);

        officeLocationBox.setText(f.officeLocation);

        emailBox.setText(f.getEmail());

        coursesOfferedBox.setText(f.courseOffered.name);

        passTextBox.setText(f.password);

        for (int i = 0; i < main.students.length; i++)
        {
            for (int j = 0; j < main.students[i].courses.length; j++)
            {

            }
        }

        /*
        coursesOfferedBox.setText(s);

        String tempstring = "";
        for (int i = 0; i < f.coursesOffered.length;i++)
        {
            for (int j = 0; j < main.courses.length; j++)
            {
                if (main.courses[j].name.equals(f.coursesOffered[i].name))
                {
                    for (int k = 0; k < main.students.length; k++)
                    {
                        for (int m = 0; m < main.students[k].courses.length; m++)
                        {
                            if (main.students[k].courses[m].name.contains(main.courses[j].name))
                            {
                                tempstring += main.students[k].getName() + " ";
                            }
                        }
                    }
                }

            }
            studentsLabel.setText(tempstring);
        }

        */




    }

    public void fillStudentList (facuilty f)
    {

    }
}
