/**
 * This class represents a health professional with basic information such as
 * ID, name, and basic details.
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String basicInfo;

    /**
     * Default constructor.
     */
    public HealthProfessional() {
        //nothing
    }

    /**
     * Constructs a HealthProfessional with the specified ID, name, and basic information.
     *
     * @param id id.
     * @param name name.
     * @param basicInfo basic information.
     */
    public HealthProfessional(int id, String name, String basicInfo) {
        this.id = id;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    /**
     * Gets the ID of the health professional.
     *
     * @return The ID of the health professional.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the health professional.
     *
     * @return The name of the health professional.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the basic information about the health professional.
     *
     * @return The basic information about the health professional.
     */
    public String getBasicInfo() {
        return basicInfo;
    }

    /**
     * Displays the details of the health professional.
     */
    public void display() {
        System.out.println(String.format("ID: %d, Name: %s, BasicInfo: %s",
                id, name, basicInfo));
    }
}
