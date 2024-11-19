/**
 * This class represents a patient in the healthcare system.
 */
public class Patient {
    private String name;
    private String mobile;

    /**
     * Constructs a new Patient with the specified name and mobile number.
     *
     * @param name The name of the patient.
     * @param mobile The mobile phone number of the patient.
     */
    public Patient(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    /**
     * Gets the name of the patient.
     *
     * @return The name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the mobile phone number of the patient.
     *
     * @return The mobile phone number of the patient.
     */
    public String getMobile() {
        return mobile;
    }
}
