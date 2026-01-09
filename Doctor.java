public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, String bloodType, String contactInfo, String specialization) {
        super(id, name, bloodType, contactInfo);
        this.specialization = specialization;
    }

    @Override
    public void performAction() {
        System.out.println("[Doctor] " + name + " is checking patients.");
    }

    @Override
    public void checkStatus() {
        System.out.println("[Doctor] " + name + " is on duty in " + specialization + ".");
    }

    public void writePrescription() {
        System.out.println("Doctor " + name + " wrote a prescription.");
    }
}