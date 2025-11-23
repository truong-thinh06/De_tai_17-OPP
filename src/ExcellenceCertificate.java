public class ExcellenceCertificate extends Certificate {
    private String honors; // Danh hieu (Gioi/Xuat sac)

    public ExcellenceCertificate(String id, String stuId, String date, String honors) {
        super(id, stuId, date);
        this.honors = honors;
    }

    @Override
    public void printCertificate() {
        System.out.println("=== CHUNG CHI XUAT SAC ===");
        System.out.println("Vinh danh HV: " + studentId);
        System.out.println("Xep loai: " + honors);
        System.out.println("Ngay: " + date);
    }
}