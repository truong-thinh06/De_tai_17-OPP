import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentService {
    private List<Payment> payments = new ArrayList<>();
    private final String FILE_NAME = "payments.dat";

    public PaymentService() {
        payments = FileHelper.readFromFile(FILE_NAME);
    }

    public void payTuition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma HV: ");
        String id = sc.nextLine();
        System.out.print("So tien dong: ");
        double money = Double.parseDouble(sc.nextLine());
        System.out.print("Ngay dong (dd/mm/yyyy): ");
        String date = sc.nextLine();

        payments.add(new Payment(id, money, date));
        FileHelper.writeToFile(FILE_NAME, payments);
        System.out.println("Thanh toan thanh cong!");
    }
}