import java.util.ArrayList;

/**
 * Main class
 */
public class AssignmentOne {
    /**
     * Main function
     * @param args args
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1, "a", "aaaaa", "Family Medicine");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "b", "bbbbb", "Internal Medicine");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "c", "ccccc", "General Medicine");

        Nurse nurse1 = new Nurse(11, "Nurse Emma", "mmmmmm", "Pediatrics");
        Nurse nurse2 = new Nurse(12, "Nurse Oliver", "nnnnn", "Emergency");

        generalPractitioner1.display();
        generalPractitioner2.display();
        generalPractitioner3.display();
        nurse1.display();
        nurse2.display();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments,"John Doe", "11111111111", "08:00", generalPractitioner1);
        createAppointment(appointments,"Jane Smith", "22222222222", "15:00", generalPractitioner2);
        createAppointment(appointments,"Emily Johnson", "33333333333", "16:00", nurse1);
        createAppointment(appointments,"Michael Brown", "44444444444", "10:00", nurse2);

        printExistingAppointments(appointments);
        cancelBooking(appointments, "11111111111");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * Creates a new appointment for a patient with the specified details and adds it to the list.
     *
     * @param appointments The list to add the appointment to.
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param time The time of the appointment.
     * @param doctor The health professional for the appointment.
     */
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile,
                                         String time, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || time == null || doctor == null) {
            System.out.println("Error: Cannot create the appointment.");
            return;
        }

        Patient patient = new Patient(patientName, patientMobile);
        Appointment newAppointment = new Appointment(time, patient, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment successfully!");
    }

    /**
     * Prints all existing appointments.
     *
     * @param appointments The list of appointments to be printed.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.display();
            }
        }
    }

    /**
     * Cancels an appointment for the specified patient mobile number.
     *
     * @param appointments The list of appointments to remove from.
     * @param mobile The mobile number of the patient whose appointment is to be canceled.
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getMobile().equals(mobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment canceled for patient: " + appointment.getPatient().getName());
                return;
            }
        }
        System.out.println("No appointment found for patient with mobile: " + mobile);
    }
}
