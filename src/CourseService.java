import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseService {
    private List<Course> courses = new ArrayList<>();
    private final String FILE_NAME = "courses.dat";

    public CourseService() {
        courses = FileHelper.readFromFile(FILE_NAME);
    }

    public void addEnglishCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID khoa hoc: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten khoa hoc: ");
        String name = sc.nextLine();
        System.out.print("Nhap hoc phi: ");
        double fee = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap trinh do (TOEIC/IELTS): ");
        String level = sc.nextLine();

        courses.add(new EnglishCourse(id, name, fee, level));
        FileHelper.writeToFile(FILE_NAME, courses);
        System.out.println("Them khoa hoc thanh cong!");
    }

    public void showAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("Chua co khoa hoc nao.");
        } else {
            for (Course c : courses) {
                c.showCourseInfo();
            }
        }
    }
}