import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();
        ClassroomService classService = new ClassroomService();
        ScheduleService scheduleService = new ScheduleService();
        StudentService studentService = new StudentService(); // Moi
        TeacherService teacherService = new TeacherService(); // Moi
        ScoreService scoreService = new ScoreService();       // Moi
        CertificateService certService = new CertificateService();
        PaymentService paymentService = new PaymentService(); // Moi
        ReportService reportService = new ReportService();    // Moi
        while (true) {
            System.out.println("\n=== QUAN LY TRUNG TAM NGOAI NGU ===");
            System.out.println("1. Quan ly KHOA HOC (Them/Xem)");
            System.out.println("2. Quan ly LOP HOC (Tao/Xem)");
            System.out.println("3. Quan ly LICH HOC (Xep lich/Xem)");
            System.out.println("4. Quan ly HOC VIEN (Them/Xem)");
            System.out.println("5. Quan ly GIAO VIEN (Them/Xem)");
            System.out.println("6. Quan ly DIEM SO (Nhap/Xem)");
            System.out.println("7. Quan ly TAI CHINH (Dong hoc phi/Bao cao)");
            System.out.println("8. Quan ly CHUNG CHI (Cap/Xem)");
            System.out.println("0. Thoat");
            System.out.print(">> Chon chuc nang: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("A. Them Khoa Anh | B. Them Khoa Nhat | C. Xem All | D. Xoa | E. Tim");
                    String c1 = scanner.nextLine().toUpperCase();
                    if(c1.equals("A")) courseService.addEnglishCourse();
                    else if(c1.equals("B")) courseService.addJapaneseCourse();
                    else if(c1.equals("C")) courseService.showAllCourses();
                    else if(c1.equals("D")) courseService.deleteCourse();
                    else if(c1.equals("E")) courseService.searchCourse();
                    break;
                case "2":
                    System.out.println("A. Tao lop | B. Xem lop");
                    if(scanner.nextLine().equalsIgnoreCase("A")) classService.createClass();
                    else classService.showAllClasses();
                    break;
                case "3":
                    System.out.println("A. Xep lich | B. Xem lich");
                    if(scanner.nextLine().equalsIgnoreCase("A")) scheduleService.addSchedule();
                    else scheduleService.showSchedules();
                    break;
                case "4": // Hoc vien
                    System.out.println("A. Them HV | B. Xem DS");
                    if(scanner.nextLine().equalsIgnoreCase("A")) studentService.addStudent();
                    else studentService.showAllStudents();
                    break;
                case "5": // Giao vien
                    System.out.println("A. Them GV | B. Xem DS");
                    if(scanner.nextLine().equalsIgnoreCase("A")) teacherService.addTeacher();
                    else teacherService.showTeachers();
                    break;
                case "6": // Diem so
                    System.out.println("A. Nhap diem | B. Xem diem");
                    if(scanner.nextLine().equalsIgnoreCase("A")) scoreService.inputScore();
                    else scoreService.showScores();
                    break;
                case "7": // Tai chinh
                    System.out.println("A. Dong hoc phi | B. Bao cao doanh thu");
                    String c7 = scanner.nextLine().toUpperCase();
                    if(c7.equals("A")) paymentService.payTuition();
                    else if(c7.equals("B")) reportService.reportRevenue();
                    break;
                case "8": // Chung chi
                    System.out.println("A. Cap chung chi | B. Xem DS");
                    if(scanner.nextLine().equalsIgnoreCase("A")) {
                        System.out.print("Nhap ID HV: "); String id = scanner.nextLine();
                        System.out.print("Diem TB: "); double s = Double.parseDouble(scanner.nextLine());
                        certService.issueCertificate(id, s);
                    } else certService.showAll();
                    break;
                case "0": System.out.println("Bye bye!"); System.exit(0);
                default: System.out.println("Sai chuc nang!");
            }
        }
    }
}