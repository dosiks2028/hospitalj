public class Patient {

    private int id;
    private String name;
    private int age;
    private String diagnosis;
    private boolean admitted;

    public Patient(int id, String name, int age, String diagnosis, boolean admitted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.admitted = admitted;
    }

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public void setAdmitted(boolean admitted) {
        this.admitted = admitted;
    }

    public void admitPatient() {
        admitted = true;
    }

    public void dischargePatient() {
        admitted = false;
    }

    @Override
    public String toString() {
        return "Patient{id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", diagnosis='" + diagnosis + '\'' +
                ", admitted=" + admitted +
                '}';
    }
}