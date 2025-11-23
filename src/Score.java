import java.io.Serializable;

public class Score implements Serializable {
    private static final long serialVersionUID = 1L;
    private String studentId;
    private String courseId;
    private double value;

    public Score(String studentId, String courseId, double value) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.value = value;
    }

    public void showScore() {
        System.out.println("HV: " + studentId + " | Khoa: " + courseId + " | Diem: " + value);
    }
}