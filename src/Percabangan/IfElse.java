package Percabangan;
public class IfElse {
    public static void main(String[] args) {
        double  totalBelanja    = 53000;
        double uangDiDompet     = 25000;
        double angsul           = totalBelanja - uangDiDompet;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, kurangi jajan anda!");
        }else if(uangDiDompet>totalBelanja) {
            System.out.println("Uang cukup, angsul : " + angsul);
        }else {
            System.out.println("Uang pas.. UwU..");
        }
    }
}
