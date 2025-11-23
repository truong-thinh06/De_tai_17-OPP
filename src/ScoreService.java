import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreService {
    private List<Score> scores = new ArrayList<>();
    private final String FILE_NAME = "scores.dat";

    public ScoreService() {
        scores = FileHelper.readFromFile(FILE_NAME);
    }

    public void inputScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Hoc Vien: ");
        String sId = sc.nextLine();
        System.out.print("Nhap Ma Khoa Hoc: ");
        String cId = sc.nextLine();

        double val = -1;
        while (val < 0 || val > 10) {
            System.out.print("Nhap diem (0-10): ");
            try {
                val = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
            }
        }

        scores.add(new Score(sId, cId, val));
        FileHelper.writeToFile(FILE_NAME, scores);
        System.out.println(">> Da luu diem so.");
    }

    public void showScores() {
        for(Score s : scores) s.showScore();
    }
}