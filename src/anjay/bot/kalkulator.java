package anjay.bot;

public class kalkulator {
    int hasil;
    //Method tambah
    public int tambah(int num1, int num2){
        hasil = num1+num2;
        return hasil;
    }
    //Method kurang
    public int kurang(int num1, int num2){
        hasil = num1-num2;
        return hasil;
    }
    //Method kali
    public int kali(int num1, int num2){
        hasil = num1*num2;
        return hasil;
    }
    //Method bagi
    public float bagi(int num1, int num2){
        hasil = num1/num2;
        return hasil;
    }
}
