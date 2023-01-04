package Model1;

public class honda {
    public static void main(String[] args, boolean Harigelap) {
        mobil supra = new mobil(4,1600,"kulit",7,"kulit");
        supra.nyalakanmesin();
        boolean harigelap = true;
        if(Harigelap){
            supra.nyalakanlampu();
        }

    }
}
