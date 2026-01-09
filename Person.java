public class Person {
    protected int id;
    protected String name;
    protected String bloodType;
    protected String contactInfo;

    public Person(int id, String name, String bloodType, String contactInfo) {
        this.id = id;
        this.name = name;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
    }

    public void performAction() {
        System.out.println(name + " is currently in the hospital facility.");
    }

    public void checkStatus() {
        System.out.println("Status for " + name + ": General monitoring.");
    }

    public void displayBasicInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Blood: " + bloodType);
    }
}