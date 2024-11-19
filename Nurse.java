/**
 * This class represents a nurse, which is a specific type of
 * health professional.
 */
public class Nurse extends HealthProfessional {
    private String department;

    /**
     * Default constructor.
     */
    public Nurse() {
        super();
    }

    /**
     * Constructs a Nurse with the specified ID, name, basic information,
     * and department.
     *
     * @param id id.
     * @param name name.
     * @param basicInfo basic information.
     * @param department department.
     */
    public Nurse(int id, String name, String basicInfo, String department) {
        super(id, name, basicInfo);
        this.department = department;
    }

    /**
     * Gets the department of the nurse.
     *
     * @return The department the nurse works in.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Displays the details of the nurse.
     */
    public void display() {
        System.out.println("Nurse:");
        super.display();
        System.out.println("Department: " + department);
    }
}
