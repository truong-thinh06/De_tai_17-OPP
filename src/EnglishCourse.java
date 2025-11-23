public class EnglishCourse extends Course {
    private String level; // VD: TOEIC, IELTS

    public EnglishCourse(String courseId, String courseName, double tuition, String level) {
        super(courseId, courseName, tuition);
        this.level = level;
    }

    @Override
    public void showCourseInfo() {
        System.out.println("Khoa TA: " + courseName + " - Level: " + level + " - Hoc phi: " + tuition);
    }
}