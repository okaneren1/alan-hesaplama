import java.util.Scanner;
public class hipotenüs {
    public static void main(String[] args) {
        double a,b,c,cevre,u;
        double alan;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz");
        a = girdi.nextDouble();
        System.out.println("2.Kenarı giriniz:");
        b = girdi.nextDouble();
        System.out.println("3.Kenarı giriniz:");
        c = girdi.nextDouble();
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı:" + alan);




    }
}
