import java.io.Serializable;

public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String id;
    protected String fullName;
    protected String phone;
    protected String email;

    public Person(String id, String fullName, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public String getId() { return id; }
    public String getFullName() { return fullName; }

    public abstract void showInfo();
}