public class Patient extends Person {
    private String diagnosis;
    private int wardNumber;

    public Patient(int id, String name, String bloodType, String contactInfo, String diagnosis, int wardNumber) {
        super(id, name, bloodType, contactInfo);
        this.diagnosis = diagnosis;
        this.wardNumber = wardNumber;
    }

    @Override
    public void performAction() {
        System.out.println("[Patient] " + name + " is resting in ward " + wardNumber + ".");
    }

    @Override
    public void checkStatus() {
        System.out.println("[Patient] " + name + " condition: stable. Diagnosis: " + diagnosis);
    }

    public void takeMedication() {
        System.out.println(name + " is taking pills.");
    }
}