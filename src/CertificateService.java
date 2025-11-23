import java.util.ArrayList;
import java.util.List;

public class CertificateService {
    private List<Certificate> certificates = new ArrayList<>();
    private final String FILE_NAME = "certificates.dat";

    public CertificateService() {
        certificates = FileHelper.readFromFile(FILE_NAME);
    }

    public void issueCertificate(String studentId, double avgScore) {
        String date = "23/11/2025";
        String id = "CERT-" + System.currentTimeMillis();

        if (avgScore >= 9.0) {
            certificates.add(new ExcellenceCertificate(id, studentId, date, "XUAT SAC"));
            System.out.println("Da cap chung chi Xuat Sac!");
        } else if (avgScore >= 5.0) {
            certificates.add(new CompletionCertificate(id, studentId, date));
            System.out.println("Da cap chung chi Hoan Thanh.");
        } else {
            System.out.println("Diem thap, khong du dieu kien cap!");
        }
        FileHelper.writeToFile(FILE_NAME, certificates);
    }

    public void showAll() {
        for (Certificate c : certificates) c.printCertificate();
    }
}