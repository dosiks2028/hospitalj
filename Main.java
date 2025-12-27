public class Main {

    public static void main(String[] args) {


        Patient patient = new Patient(1, "Michael J.Fox", 0, "", false);


        patient.setAge(26);
        patient.setDiagnosis("Cold");


        System.out.println("Patient name: " + patient.getName());
        System.out.println("Patient age: " + patient.getAge());
        System.out.println("Patient diagnosis: " + patient.getDiagnosis());
        System.out.println("Is admitted: " + patient.isAdmitted());


        patient.admitPatient();
        System.out.println("After admit: " + patient.isAdmitted());

        patient.dischargePatient();
        System.out.println("After discharge: " + patient.isAdmitted());

        System.out.println(patient);


        Doctor doctor = new Doctor(101, "Dr. Brown", "Therapist", 10, true);


        doctor.setExperienceYears(12);
        doctor.setSpecialization("General Medicine");


        System.out.println("Doctor name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Experience: " + doctor.getExperienceYears());
        System.out.println("Available: " + doctor.isAvailable());


        doctor.endShift();
        System.out.println("After end shift: " + doctor.isAvailable());

        doctor.startShift();
        System.out.println("After start shift: " + doctor.isAvailable());

        System.out.println(doctor);


        Appointment appointment = new Appointment(
                1001,
                "2025-01-10",
                "14:30",
                patient,
                doctor
        );


        appointment.setDate("2025-01-11");
        appointment.setTime("15:00");


        System.out.println("Appointment date: " + appointment.getDate());
        System.out.println("Appointment time: " + appointment.getTime());
        System.out.println("Patient in appointment: " + appointment.getPatient().getName());
        System.out.println("Doctor in appointment: " + appointment.getDoctor().getName());


        System.out.println("Can be scheduled: " + appointment.canBeScheduled());
        appointment.reschedule("2025-01-12", "16:00");

        System.out.println(appointment);
    }
}