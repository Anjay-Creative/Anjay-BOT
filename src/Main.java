import java.util.*;
import anjay.function.*;
public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("======>Welcome<======");
            //Login
            menu.main(); // tampilkan menu

            Scanner penulis = new Scanner(System.in);

            System.out.print("Masukan pilihan: ");
            var pilihan = penulis.nextInt();
            menu.Seleksi(pilihan);

            System.out.print("Ulang program (y/n)? =  ");
            var akhir_menu = penulis.next().equals("n");
            if (akhir_menu){
                break;
            }else{
                fungsi.clearConsole();
            }

        }


    }
}
