import java.io.Serializable;

public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    private String classId;
    private String dayOfWeek; // Thu 2, Thu 3...
    private String shift; // Ca sang, Ca chieu

    public Schedule(String classId, String dayOfWeek, String shift) {
        this.classId = classId;
        this.dayOfWeek = dayOfWeek;
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Lich hoc: " + classId + " - " + dayOfWeek + " (" + shift + ")";
    }
}