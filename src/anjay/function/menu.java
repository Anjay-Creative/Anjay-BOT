package anjay.function;
import anjay.bot.*;

public class menu {
    public static void main(){
        System.out.println("""
                1. Kalkulator (+,-,*,/)
                2. Waktu dan Jam Dunia
                3. Konversi mata uang
                4. NPM to text
                5. dll""");
    }
    public int Seleksi(int pilih) {
        switch(pilih){
            case 1:
                kalkulator hitung = new kalkulator();
                System.out.println(hitung.bagi(4,2));
        }
        return pilih;
    }

}
