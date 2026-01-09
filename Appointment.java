public class Appointment {
    private int appId;
    private Doctor doctor;
    private Patient patient;

    public Appointment(int appId, Doctor doctor, Patient patient) {
        this.appId = appId;
        this.doctor = doctor;
        this.patient = patient;
    }

    public void displayAppointment() {
        System.out.println("Appointment #" + appId);

        System.out.println("Doctor: " + doctor.name);
        System.out.println("Patient: " + patient.name);
    }
}