import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();
        ClassroomService classService = new ClassroomService(); // Them dong nay
        ScheduleService scheduleService = new ScheduleService();
        CertificateService certService = new CertificateService();
        while (true) {
            System.out.println("\n=== QUAN LY TRUNG TAM ===");
            System.out.println("1. Them khoa Tieng Anh");
            System.out.println("2. Them khoa Tieng Nhat"); // Moi
            System.out.println("3. Xem danh sach khoa hoc");
            System.out.println("4. Tao lop hoc moi"); // Moi
            System.out.println("5. Xem danh sach lop"); // Moi
            System.out.println("6. Xep lich hoc cho lop");
            System.out.println("7. Xem thoi khoa bieu");
            System.out.println("10. Cap chung chi (Demo)");
            System.out.println("11. Xem danh sach chung chi");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": courseService.addEnglishCourse(); break;
                case "2": courseService.addJapaneseCourse(); break;
                case "3": courseService.showAllCourses(); break;
                case "4": classService.createClass(); break;
                case "5": classService.showAllClasses(); break;
                case "6": scheduleService.addSchedule(); break;
                case "7": scheduleService.showSchedules(); break;
                case "10":
                    // Demo cap bang nhanh
                    System.out.print("Nhap ID HV: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap diem tong ket: ");
                    double score = Double.parseDouble(scanner.nextLine());
                    certService.issueCertificate(id, score);
                    break;
                case "11": certService.showAll(); break;
                case "0": System.exit(0);
                default: System.out.println("Sai chuc nang!");
            }
        }
    }
}