public class Student extends Person {
    private String studentId;
    private String classId; // Lop dang hoc

    public Student(String id, String fullName, String phone, String email, String studentId) {
        super(id, fullName, phone, email);
        this.studentId = studentId;
        this.classId = "Unassigned"; // Mac dinh chua xep lop
    }

    public String getStudentId() { return studentId; }

    @Override
    public void showInfo() {
        System.out.println("HV: " + fullName + " - ID: " + studentId + " - Lop: " + classId);
    }
}