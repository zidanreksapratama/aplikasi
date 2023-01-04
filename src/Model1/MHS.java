package Model1;

import java.util.Scanner;

public class MHS {
    private String nik;
    private String nama;
    private String alamat;
    private String tgl;
    public int  totalmahasiswa(){
        int total =0;
        total ++;
        return total;
    }
    public String[] CekMHSDenganPrefix(){
        return null;
    }

    public MHS(){

    }

    public MHS(String Nik,String Nama,String Alamat,String Tgl){
        this.nik=Nik;
        this.nama=Nama;
        this.alamat=Alamat;
        this.tgl=Tgl;
    }

    public static void main(String[] args) {
        MHS Student1 = new MHS();
        MHS Student2 = new MHS();
        MHS[]student = new MHS[1000];
        Scanner sc = new Scanner(System.in);
        for(int Jumlahmhs = 0; Jumlahmhs<student.length; Jumlahmhs++){

        }

        MHS bocah1 = new MHS("001","Puad","Lor","28 september 2004");
        bocah1.CekMHSDenganPrefix();
    }

}
//Buatlah model untuk login user ke dalam suatu apps
//Tambahkan metode Checkpassword