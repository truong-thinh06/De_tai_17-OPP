import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();
    private final String FILE_NAME = "teachers.dat";

    public TeacherService() {
        teachers = FileHelper.readFromFile(FILE_NAME);
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap Ho ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap SDT: ");
        String phone = sc.nextLine();
        System.out.print("Nhap Email: ");
        String email = sc.nextLine();
        System.out.print("Nhap Trinh do (IELTS/TOEIC): ");
        String qual = sc.nextLine();

        teachers.add(new Teacher(id, name, phone, email, qual));
        FileHelper.writeToFile(FILE_NAME, teachers);
        System.out.println(">> Them giao vien thanh cong.");
    }

    public void showTeachers() {
        if (teachers.isEmpty()) System.out.println("Danh sach giao vien trong.");
        for (Teacher t : teachers) t.showInfo();
    }
}