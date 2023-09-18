import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static boolean shouldWakeUp(boolean havlama, int saat) {
        if (havlama && (saat >= 0 && saat < 8) || (saat == 23)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean hasTeen(int yas1, int yas2, int yas3) {
        if ((yas1 >= 13 && yas1 <= 19) || (yas2 >= 13 && yas2 <= 19) || (yas3 >= 13 && yas3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isCatPlaying(boolean yazMevsimi ,int derece){
        int maxDegree= yazMevsimi ? 45 : 35 ;
        return derece >= 25 && derece <= maxDegree;
    }

    public static double area(double number1 ,double number2){
        if (number1 < 0 || number2 < 0){
            System.out.println("Hatalı Giriş!");
            return -1.0;
        }else {
           return number1 * number2;
        }
    }

    public static double area1 (double r){
        if(r < 0){
            System.out.println("Hatalı Giriş!");
            return -1.0;
        }else {
            return r * r* Math.PI;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


        Scanner input = new Scanner(System.in);
        System.out.println("İlk Kenar Uzunluğunu Veriniz:");
        double number1 = input.nextDouble();
        System.out.println("İkinci Kenar Uzunluğunu Veriniz:");
        double number2 = input.nextDouble();
        double alan = area(number1,number2);
        if(alan != -1.0){
            System.out.println("Dikdörtgenin Alanı: " + alan);
        }
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        Scanner alan2 =new Scanner(System.in);
        System.out.println("İlk Değeri Veriniz:");
        double r = alan2.nextDouble();
        double alan3 = area1(r);
        if(alan3 != -1.0){
            System.out.println("Dairenin Alanı: " + alan3);
        }
        input.close();

        System.out.println(area1(5.0));
        System.out.println(area1(-1));
    }

}
