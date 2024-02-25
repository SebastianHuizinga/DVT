/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import static javax.print.attribute.standard.MediaPrintableArea.MM;
import javax.swing.JLabel;

/**
 *
 * @author sebastianh
 */
public class Validator {

    public boolean validateRange(String inputData, JLabel label) {

        if (inputData.length() != 10) {
            label.setText("Please enter a valid 10 digit phone number");
            return false;
        } else {
            try {
                int intInputData = Integer.parseInt(inputData);
                label.setText(" ");
                return true;
            } catch (Exception e) {
                label.setText("Please enter a valid 10 digit phone number");
            }

        }
        return false;
    }

    public boolean validateDinoName(String name, String species, JLabel label) {
        boolean validated = false;
        if (name.length() > 3 && species.length() > 3) {
            if (name.substring(name.length() - 3).equals(species.substring(species.length() - 3))) {
                validated = true;
                if (name.contains(" ")) {
                    validated = false;
                    label.setText("INVALID NAME: Contains spaces.");
                } else {
                    label.setText("");
                }
            } else {
                label.setText("INVALID NAME: Name and species don't match.");
            }
        } else {
            label.setText("INVALID NAME: Name too short.");
        }
        return validated;
    }



    public boolean numValidator(int value, JLabel label) {
        if (value <= 0) {
            label.setText("MORE BONES");
            return false;
        }
        else if (value > 2000){
            label.setText("stop lying");
            return false;
        }
            else {
            label.setText(" ");
            return true;

        }
    }

    public boolean dateChecker(String enteredDate, JLabel label) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try {
            LocalDate dateOfDiscovery = LocalDate.parse(enteredDate, formatter);
            label.setText(" ");
            return true;
        } catch (DateTimeParseException e) {
            label.setText("Ivalid Date. Please use yyyy/MM/dd format and ensure it is valid.");
            return false;
        }
    }
}
