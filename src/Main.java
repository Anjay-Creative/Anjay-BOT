import java.util.*;
import anjay.function.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("======>Welcome<======");

        menu.main(); // tampilkan menu

        Scanner penulis = new Scanner(System.in);
        System.out.print("Masukan pilihan: ");
        System.out.println(new menu().Seleksi(penulis.nextInt()));

    }
}
