import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        data.add("Ferdi");
        data.add("Budi");
        data.add("Siti");

        for (String nama : data) {
            System.out.println(nama);
        }
    }
}