import java.util.Scanner;

public class method3 {
    public static String cetakjudul(){
        return "Hello kelas 1A";
    }
    public static String inputuser(){
        Scanner Inputdata = new Scanner(System.in);
        System.out.println("Masukan nama user =");
        String username = Inputdata.nextLine();
        return username;
    }
    public static int[] angkaarray(){
        int[] numberarray = new int[]{1,2,3,4,5};
        return numberarray;
    }
    public static String ganjilgenap(int a, int b){
        int hasil = a+b;
        if(hasil%2==0){
            return "genap";
        }else{
            return "ganjil";
        }
    }

    public static void main(String[] args) {
        String judul = cetakjudul();
        System.out.println(judul);

        String namauser = inputuser();
        System.out.println("Nama anda = "+ namauser);

        int[] arraynumber = angkaarray();
        for(int angka : arraynumber) {
            System.out.println("Angka" + angka);
        }
        String status = ganjilgenap(5,9);
        System.out.println("Statusnya adalah = "+status);
    }
}
