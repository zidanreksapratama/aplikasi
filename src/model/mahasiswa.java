package model;

public class mahasiswa {
    private String Nim;
    private String Nama;
    private String Alamat;
    private String Jurusan;
    private String Kelas;
    private double[] Nilai;

    public mahasiswa() {
    }

    public mahasiswa (String nim,String nama,String alamat,String jurusan,String kelas,double[] nilai){
        this.Nim=nim;
        this.Nama=nama;
        this.Alamat=alamat;
        this.Jurusan=jurusan;
        this.Kelas=kelas;
        this.Nilai=nilai;
    }

    public static void main(String[] args) {
        mahasiswa siswa1 = new mahasiswa();
        siswa1.Nim = "001";
        siswa1.Nama = "yudi";
        siswa1.Alamat = "jalan";
        siswa1.Jurusan = "informatika";
        siswa1.Kelas = "1A";


    }
}
