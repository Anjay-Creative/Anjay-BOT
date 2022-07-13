package anjay.function;
import anjay.bot.*;
import java.util.*;
public class menu {

    public static void main(){
        System.out.println("""
                1. Kalkulator (+,-,*,/)
                2. Waktu dan Jam Dunia
                3. Konversi mata uang
                4. NPM to text
                """);
    }
    public static void Seleksi(int pilih) {
        Scanner Inputan = new Scanner(System.in);
        switch(pilih){
            case 1:
                kalkulator hitung = new kalkulator();
                System.out.print("Masukan nilai: ");
                String temp_1 = Inputan.next();
                String[] tmp_kal = new String[512];
                double[] temp_dobel;
                int counter=0;
                // Arie

                if (temp_1.contains("*")) {
                    var ano = temp_1.split("\\*");
                    System.out.println(Arrays.toString(ano));
                    System.out.println(Arrays.);

//                    System.out.println("Hasilnya adalah: " + hitung.kali(Integer.valueOf(tmp_kal[0]),Integer.valueOf(tmp_kal[1])));
                }
                if (temp_1.contains("/")) {
                    tmp_kal = temp_1.split("/");

//                    System.out.println("Hasilnya adalah: " + hitung.bagi(Integer.valueOf(tmp_kal[0]),Integer.valueOf(tmp_kal[1])));
                }
                if (temp_1.contains("+")) {
                    tmp_kal = temp_1.split("\\+");

//                    System.out.println("Hasilnya adalah: " + hitung.tambah(Integer.valueOf(tmp_kal[0]),Integer.valueOf(tmp_kal[1])));
                }
                if (temp_1.contains("-")) {
                    tmp_kal = temp_1.split("-");
//                    System.out.println("Hasilnya adalah: " + hitung.kurang(Integer.valueOf(tmp_kal[0]), Integer.valueOf(tmp_kal[1])));
                }

                for (var hayuk:tmp_kal) {
                    System.out.println("HASIL:"+ hayuk);
                }
                break;
            case 2:
                //Waktu Sekarang dan Jam Dunia
                System.out.print("Masukan jam sekarang dalam (6/12/3): ");
                var jam = Inputan.nextInt();
                jamdunia.main(jam);
                break;
            case 3:
                //Konversi mata uang
            case 4:
                // NPM to text
            case 5:
                //Masih dipikirkan mungkin pake youtube download?
        }

    }

}
