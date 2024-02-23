/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            label.setText(" ");
            return true;

        }
    }

    public boolean validateDinoName(String Name, String Species, JLabel label) {

        boolean validated = false;

        if (Name.substring((Name.length() - 3), Name.length() - 1).equals(Species.substring((Species.length() - 3), Species.length() - 1))) {
            validated = true;
            if (Name.contains(" ")) {
                validated = false;
                label.setText("INVALID NAME");
            } else {
                validated = true;
                label.setText(" ");
            }
        } else {
            label.setText("INVALID NAME");
        }

        return validated;
    }

    public boolean contactValidator() {
        return false;
    }

    public boolean numValidator(int value, JLabel label) {
        if (value < 0) {
            label.setText("MORE BONES");
            return false;
        } else {
            label.setText(" ");
            return true;

        }

    }

    public boolean dateChecker(String enteredDate, JLabel label) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dateOfDiscovery = LocalDate.parse(enteredDate, formatter);
        System.out.println(dateOfDiscovery);
        return false;

    }

}
