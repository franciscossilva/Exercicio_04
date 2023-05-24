import java.util.Scanner;
public class Idadeemdias {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int anos, meses, dias, Idadeemdias;
        System.out.println("digite sua idade em anos,meses e dias:");
        System.out.print("anos: ");
        anos = scanner.nextInt();
        System.out.print("meses: ");
        meses = scanner.nextInt();
        System.out.print("dias : ");
        dias = scanner.nextInt();
        Idadeemdias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A sua idade em dias é : "+Idadeemdias+ "dias.");
    }
}
