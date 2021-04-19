package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 50000;
        double uangDiDompet = 20000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajanan anda");
        }else{
            System.out.println("Uang ngepass");
        }
    }
}
