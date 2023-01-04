package Model1;

public class mobil {
    private int jumlahroda;
    private int kapasitas;
    private String jeniskursi;
    private int jumlahkursi;
    private String jenissetir;
    public mobil(){    //constructor

    }

    public mobil(int roda, int mesin, String Jenis, int kursi, String setir) {
        this.jumlahroda = roda;
        this.jeniskursi = Jenis;
        this.kapasitas = mesin;
        this.jumlahkursi = kursi;
        this.jenissetir = setir;
    }


    public static void main(String[] args) {
        mobil avanza = new mobil();
        avanza.jumlahroda = 5;
        avanza.kapasitas = 2000;
        avanza.jeniskursi = "kulit";
        avanza.jumlahkursi = 7;
        avanza.jenissetir = "kulit";

        mobil supra = new mobil(4,1600,"kulit",7,"kulit");

    }

    public void nyalakanlampu(){
        System.out.println("lampu sudah dinyalakan");
    }
    public void nyalakanmesin(){
        System.out.println("Mesin sudah dinyalakan");
    }


}
