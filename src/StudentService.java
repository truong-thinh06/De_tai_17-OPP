import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.dat";

    public StudentService() {
        students = FileHelper.readFromFile(FILE_NAME);
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID (CCCD): ");
        String id = sc.nextLine();
        System.out.print("Nhap Ho ten: ");
        String name = sc.nextLine();
        String phone = "";
        while (true) {
            System.out.print("Nhap SDT (9-11 so): ");
            phone = sc.nextLine();
            if (phone.matches("\\d{9,11}")) break;
            System.out.println("SDT khong hop le, vui long nhap lai!");
        }
        // ... (tiếp tục nhập email)
        System.out.print("Nhap Email: ");
        String email = sc.nextLine();
        System.out.print("Nhap Ma Hoc Vien: ");
        String stuId = sc.nextLine();

        // Mac dinh khi moi tao thi chua co lop (classId = "Unassigned")
        students.add(new Student(id, name, phone, email, stuId));
        FileHelper.writeToFile(FILE_NAME, students);
        System.out.println(">> Da luu ho so hoc vien moi.");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            System.out.println("--- DANH SACH HOC VIEN ---");
            for (Student s : students) s.showInfo();
        }
    }
}