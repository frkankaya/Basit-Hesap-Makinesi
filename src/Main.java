import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);


        System.out.print("Ilk Sayiyi Giriniz :");
        n1 = inp.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = inp.nextInt();

        System.out.println("Bir Islem Seciniz :");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;

            case 2:
                System.out.println(n1 - n2);
                break;

            case 3:
                System.out.println(n1 * n2);
                break;

            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Hatali Giris Yaptiniz");
                        break;
                    default:
                        System.out.println(n1 / n2);
                        break;
                }
                break;

            default:
                System.out.println("Hatali Giris Yaptiniz");
        }
    }
}