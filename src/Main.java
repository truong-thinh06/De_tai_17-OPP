import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();
        ClassroomService classService = new ClassroomService(); // Them dong nay

        while (true) {
            System.out.println("\n=== QUAN LY TRUNG TAM ===");
            System.out.println("1. Them khoa Tieng Anh");
            System.out.println("2. Them khoa Tieng Nhat"); // Moi
            System.out.println("3. Xem danh sach khoa hoc");
            System.out.println("4. Tao lop hoc moi"); // Moi
            System.out.println("5. Xem danh sach lop"); // Moi
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": courseService.addEnglishCourse(); break;
                case "2": courseService.addJapaneseCourse(); break;
                case "3": courseService.showAllCourses(); break;
                case "4": classService.createClass(); break;
                case "5": classService.showAllClasses(); break;
                case "0": System.exit(0);
                default: System.out.println("Sai chuc nang!");
            }
        }
    }
}