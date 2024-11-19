/**
 * This class represents an appointment in the healthcare system.
 */
public class Appointment {
    private String time;
    private Patient patient;
    private HealthProfessional doctor;

    /**
     * Default constructor.
     */
    public Appointment() {
        //nothing
    }

    /**
     * Constructs a new Appointment with the specified time, patient, and doctor.
     *
     * @param time The time of the appointment.
     * @param patient The patient who has scheduled the appointment.
     * @param doctor The doctor or health professional who will attend the appointment.
     */
    public Appointment(String time, Patient patient, HealthProfessional doctor) {
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }

    /**
     * Gets the time of the appointment.
     *
     * @return The time of the appointment.
     */
    public String getTime() {
        return time;
    }

    /**
     * Gets the patient associated with the appointment.
     *
     * @return The patient who made the appointment.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Gets the doctor or health professional who is scheduled for the appointment.
     *
     * @return The doctor or health professional for the appointment.
     */
    public HealthProfessional getDoctor() {
        return doctor;
    }

    /**
     * Displays the details of the appointment.
     */
    public void display() {
        System.out.println(String.format("Appointment - Time: %s, Patient: %s, Doctor: %s",
                time,
                patient.getName(),
                doctor.getName()
        ));
    }
}
