/**
 * This class represents a general practitioner.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String practiceType;

    /**
     * Default constructor.
     */
    public GeneralPractitioner() {
        super();
    }

    /**
     * Constructs a GeneralPractitioner with the specified ID, name, basic information,
     * and practice type.
     *
     * @param id id.
     * @param name name.
     * @param basicInfo basic information.
     * @param practiceType type of practice.
     */
    public GeneralPractitioner(int id, String name, String basicInfo, String practiceType) {
        super(id, name, basicInfo);
        this.practiceType = practiceType;
    }

    /**
     * Gets the practice type of the general practitioner.
     *
     * @return The type of practice the general practitioner specializes in.
     */
    public String getPracticeType() {
        return practiceType;
    }

    /**
     * Displays the details of the general practitioner
     */
    public void display() {
        System.out.println("General Practitioner:");
        super.display();
        System.out.println("Practice Type: " + practiceType);
    }
}
