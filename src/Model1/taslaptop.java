package Model1;

import java.util.ArrayList;
import java.util.Scanner;

public class taslaptop {
    private String merk;
    private int jumlahKantong;
    private String Bahan;
    private String warna;
    private boolean talitas;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getJumlahKantong() {
        return jumlahKantong;
    }

    public void setJumlahKantong(int jumlahKantong) {
        this.jumlahKantong = jumlahKantong;
    }

    public String getBahan() {
        return Bahan;
    }

    public void setBahan(String bahan) {
        Bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTalitas() {
        return talitas;
    }

    public void setTalitas(boolean talitas) {
        this.talitas = talitas;
    }

    public taslaptop(){
    }

    public taslaptop(String Merk,int Jum,String bahan,String Warna,boolean tali){
        this.merk = Merk;
        this.jumlahKantong = Jum;
        this.Bahan = bahan;
        this.warna = Warna;
        this.talitas = tali;
    }

    public static void main(String[] args) {
        taslaptop lenovo = new taslaptop();
        lenovo.setMerk("lenovo Idepad");
        lenovo.setJumlahKantong(4);
        lenovo.setBahan("Katun");
        lenovo.setWarna("putih");
        lenovo.setTalitas(true);

        System.out.println(lenovo.getMerk());
        System.out.println(lenovo.getJumlahKantong());
        System.out.println(lenovo.getBahan());
        System.out.println(lenovo.getWarna());
        System.out.println("Tali :" + lenovo.isTalitas());

        taslaptop Dell = new taslaptop("Dell Optima", 3, "kulit", "hitam", false);

        ArrayList<taslaptop> Asus = new ArrayList<>();
        taslaptop u = new taslaptop();
        for(int index=0;index<10;index++){
            Scanner sc = new Scanner(System.in);
            System.out.println("masukkan merk : ");
            u.setMerk(sc.nextLine());
            System.out.println("masukkan jumlah kantong tas : ");
            u.setJumlahKantong(sc.nextInt());
            System.out.println("masukkan jenis bahan : ");
            u.setBahan(sc.nextLine());
            System.out.println("masukkan warna : ");
            u.setWarna(sc.nextLine());
            System.out.println("apakah tas menggunakan tali ? ");
            u.setTalitas(sc.nextBoolean());
            Asus.add(u);
        }
    }





}
