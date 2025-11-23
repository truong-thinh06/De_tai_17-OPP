import java.io.Serializable;

public class Classroom implements Serializable {
    private static final long serialVersionUID = 1L;
    private String classId;
    private String className;
    private String courseId; // Lop nay day khoa hoc nao

    public Classroom(String classId, String className, String courseId) {
        this.classId = classId;
        this.className = className;
        this.courseId = courseId;
    }

    public void showInfo() {
        System.out.println("Lop: " + className + " (" + classId + ") - Ma Khoa: " + courseId);
    }

    public String getClassId() { return classId; }
}