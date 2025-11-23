import java.io.Serializable;

public abstract class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String courseId;
    protected String courseName;
    protected double tuition;

    public Course(String courseId, String courseName, double tuition) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.tuition = tuition;
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }

    public abstract void showCourseInfo();
}