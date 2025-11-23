import java.io.Serializable;

public abstract class Certificate implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String certificateId;
    protected String studentId;
    protected String date;

    public Certificate(String certificateId, String studentId, String date) {
        this.certificateId = certificateId;
        this.studentId = studentId;
        this.date = date;
    }

    public abstract void printCertificate();
}