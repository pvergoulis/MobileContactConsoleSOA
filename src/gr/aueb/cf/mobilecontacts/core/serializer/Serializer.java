package gr.aueb.cf.mobilecontacts.core.serializer;

import gr.aueb.cf.mobilecontacts.dto.MobileContactReadOnlyDTO;

public class Serializer {

    // No instances of this class should be available
    private Serializer() {

    }

    public static String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " + readOnlyDTO.getId() + ", Ονομα: " + readOnlyDTO.getFirstname()
                + ", Επωνυμο: " + readOnlyDTO.getLastname() + ", Τηλ. Αριθμος: " + readOnlyDTO.getPhoneNumber();
    }
}
