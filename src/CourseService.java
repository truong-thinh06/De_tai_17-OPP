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
        if (fee < 0) {
            System.out.println("Hoc phi khong hop le!");
            return;
        }
        System.out.print("Nhap trinh do (TOEIC/IELTS): ");
        String level = sc.nextLine();

        courses.add(new EnglishCourse(id, name, fee, level));
        FileHelper.writeToFile(FILE_NAME, courses);
        System.out.println("Them khoa hoc thanh cong!");
    }
    public void addJapaneseCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap hoc phi: ");
        double fee = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap cap do (N5-N1): ");
        String level = sc.nextLine();

        courses.add(new JapaneseCourse(id, name, fee, level));
        FileHelper.writeToFile(FILE_NAME, courses);
        System.out.println("Them khoa tieng Nhat thanh cong!");
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
    public void deleteCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID khoa hoc can xoa: ");
        String id = sc.nextLine();

        // Dung lambda de xoa cho nhanh
        boolean removed = courses.removeIf(c -> c.getCourseId().equals(id));

        if (removed) {
            FileHelper.writeToFile(FILE_NAME, courses);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay ID nay.");
        }
    }
    public void searchCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khoa hoc can tim: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("--- Ket qua ---");
        for (Course c : courses) {
            if (c.getCourseName().toLowerCase().contains(keyword)) {
                c.showCourseInfo();
            }
        }
    }
}