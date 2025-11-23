import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    // Luu danh sach doi tuong vao file
    public static <T> void writeToFile(String fileName, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            System.out.println("Da luu file: " + fileName);
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }

    // Doc danh sach doi tuong tu file
    @SuppressWarnings("unchecked")
    public static <T> List<T> readFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) return list;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            list = (List<T>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
        return list;
    }
}