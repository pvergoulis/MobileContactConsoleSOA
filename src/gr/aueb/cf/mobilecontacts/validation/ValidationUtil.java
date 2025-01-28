package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {

    /**
     * No instances of this class should be available.
     */
    private ValidationUtil() {

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5)
            errorResponse += " Ο τηλ. Αριθμος πρεπει να εχει περισσοτερα απο 5 συμβολα\n";
        if (insertDTO.getFirstname().length() < 2)
            errorResponse += "Το ονομα πρεπει να περιεχει δυο ή περισσοτερους χαρακτηρες\n";
        if (insertDTO.getLastname().length() < 2)
            errorResponse += "Το επωνυμο πρεπει να περιεχει δυο ή περισσοτερους χαρακτηρες\n";
        return errorResponse;
    }


    public static String validateDTO(MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5)
            errorResponse += " Ο τηλ. Αριθμος πρεπει να εχει περισσοτερα απο 5 συμβολα\n";
        if (updateDTO.getFirstname().length() < 2)
            errorResponse += "Το ονομα πρεπει να περιεχει δυο ή περισσοτερους χαρακτηρες\n";
        if (updateDTO.getLastname().length() < 2)
            errorResponse += "Το επωνυμο πρεπει να περιεχει δυο ή περισσοτερους χαρακτηρες\n";
        return errorResponse;
    }
}
