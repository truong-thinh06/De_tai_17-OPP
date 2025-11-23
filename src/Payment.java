import java.io.Serializable;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    private String studentId;
    private double amount;
    private String date;

    public Payment(String studentId, double amount, String date) {
        this.studentId = studentId;
        this.amount = amount;
        this.date = date;
    }
    public double getAmount() { return amount; }
    @Override
    public String toString() {
        return "Hoa don: HV " + studentId + " - " + amount + " VND - Ngay: " + date;
    }
}