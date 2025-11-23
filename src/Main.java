import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();

        while (true) {
            System.out.println("\n=== QUAN LY TRUNG TAM ===");
            System.out.println("1. Them khoa hoc Tieng Anh");
            System.out.println("2. Xem danh sach khoa hoc");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": courseService.addEnglishCourse(); break;
                case "2": courseService.showAllCourses(); break;
                case "0": System.exit(0);
                default: System.out.println("Chon sai!");
            }
        }
    }
}