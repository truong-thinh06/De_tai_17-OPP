public class Teacher extends Person {
    private String qualification; // Trinh do (IELTS, TOEIC...)

    public Teacher(String id, String fullName, String phone, String email, String qualification) {
        super(id, fullName, phone, email);
        this.qualification = qualification;
    }

    public String getQualification() { return qualification; }

    @Override
    public void showInfo() {
        System.out.println("GV: " + fullName + " - Trinh do: " + qualification);
    }
}