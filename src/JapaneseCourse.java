public class JapaneseCourse extends Course {
    private String jlptLevel; // N5, N4, N3...

    public JapaneseCourse(String courseId, String courseName, double tuition, String jlptLevel) {
        super(courseId, courseName, tuition);
        this.jlptLevel = jlptLevel;
    }

    @Override
    public void showCourseInfo() {
        System.out.println("Khoa Nhat: " + courseName + " - JLPT: " + jlptLevel + " - Hoc phi: " + tuition);
    }
}