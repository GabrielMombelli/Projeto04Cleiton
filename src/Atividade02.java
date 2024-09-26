import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para realizar uma contagem regreciva: ");
        int num = sc.nextInt();

        System.out.println("Vamos começar a contagem Regreciva");
        while (num > 0) {
            System.out.println(num);
            num--;
        }

    }

}