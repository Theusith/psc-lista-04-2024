/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do{
            System.out.println("Digite uma nota de 0 a 10");
            nota = sc.nextInt();
            if(nota < 0 || nota >10){
                System.out.println("Valor invalido, tente novamente.");
            }else{
                System.out.println("Nota: " + nota);
            }
        }while(nota <0 || nota >10);
        sc.close();

    }
}
