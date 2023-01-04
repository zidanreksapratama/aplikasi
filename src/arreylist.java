import java.util.ArrayList;

public class arreylist {
    // tidak terbatas
    // index dimulai dari nol
    // arraylist besarnya ditentukan dengan syntack size()
    // contoh

    // ArrayList<int> s= new ArrayList<>();
    // ArrayList <T> u= new ArrayList <T>;

    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<Integer>();
        angka.add(0, 1);
        angka.add(1, 3);//key dan value
        for (int index = 0; index < angka.size(); index++) {
            System.out.println(angka.get(index));
        }

        //ArrayList<String> kalimat = new ArrayList<String>();
        //kalimat.add(0, "Hello");
       // kalimat.add(2, "Kelas1A");

        ArrayList<Integer> Angkasaya = new ArrayList<Integer>();
        int indexsaya=0;
        for(int index=10;index<=30;index++){
            Angkasaya.add(indexsaya,index);
            indexsaya++;
            System.out.println("hasil"+index++);

        }
    }

    public class mahasiswa{
     private String Nim;
     private String Nama;
     private String Alamat;
     private String Jurusan;
     private String Kelas;
     private double[] Nilai;

     public mahasiswa(){
     }

     public mahasiswa (String nim,String nama,String alamat,String jurusan,String kelas,double[] nilai){
         this.Nim=nim;
         this.Nama=nama;
         this.Alamat=alamat;
         this.Jurusan=jurusan;
         this.Kelas=kelas;
         this.Nilai=nilai;
     }
    }
}
