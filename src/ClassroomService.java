import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomService {
    private List<Classroom> classes = new ArrayList<>();
    private final String FILE_NAME = "classes.dat";

    public ClassroomService() {
        classes = FileHelper.readFromFile(FILE_NAME);
    }

    public void createClass() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        String name = sc.nextLine();
        System.out.print("Nhap ma khoa hoc tuong ung: ");
        String courseId = sc.nextLine();

        classes.add(new Classroom(id, name, courseId));
        FileHelper.writeToFile(FILE_NAME, classes);
        System.out.println("Tao lop hoc thanh cong!");
    }

    public void showAllClasses() {
        try {
            if (classes.isEmpty()) {
                throw new NotFoundException("Danh sach lop trong!");
            }
            for (Classroom c : classes) c.showInfo();
        } catch (NotFoundException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}