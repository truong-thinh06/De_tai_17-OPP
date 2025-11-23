import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleService {
    private List<Schedule> schedules = new ArrayList<>();
    private final String FILE_NAME = "schedules.dat";

    public ScheduleService() {
        schedules = FileHelper.readFromFile(FILE_NAME);
    }

    public void addSchedule() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Lop: ");
        String classId = sc.nextLine();
        System.out.print("Nhap Thu (2-CN): ");
        String day = sc.nextLine();
        System.out.print("Nhap Ca (Sang/Chieu/Toi): ");
        String shift = sc.nextLine();

        schedules.add(new Schedule(classId, day, shift));
        FileHelper.writeToFile(FILE_NAME, schedules);
        System.out.println("Xep lich thanh cong!");
    }

    public void showSchedules() {
        for (Schedule s : schedules) System.out.println(s.toString());
    }
}