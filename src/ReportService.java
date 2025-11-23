import java.util.List;

public class ReportService {
    // Tinh tong doanh thu tu danh sach thanh toan
    public void reportRevenue() {
        List<Payment> payments = FileHelper.readFromFile("payments.dat");
        double total = 0;
        for (Payment p : payments) {
            // Can them getter getAmount() ben Payment.java neu chua co
            // O day gia su ban da them hoac tinh dummy
            // total += p.getAmount();
        }
        System.out.println("--- BAO CAO DOANH THU ---");
        System.out.println("Tong so giao dich: " + payments.size());
        // System.out.println("Tong tien: " + total);
        System.out.println("(Can cap nhat Getter o Payment de tinh chinh xac)");
    }
}