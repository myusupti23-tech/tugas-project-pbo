import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("Ferdi");
        antrian.add("Budi");
        antrian.add("Siti");

        System.out.println("Ambil data pertama: " + antrian.poll());

        System.out.println("Sisa data:");
        for (String data : antrian) {
            System.out.println(data);
        }
    }
}
