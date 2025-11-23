public class CompletionCertificate extends Certificate {
    public CompletionCertificate(String id, String stuId, String date) {
        super(id, stuId, date);
    }

    @Override
    public void printCertificate() {
        System.out.println("[CHUNG CHI HOAN THANH]");
        System.out.println("Cap cho HV: " + studentId);
        System.out.println("Ngay cap: " + date);
    }
}