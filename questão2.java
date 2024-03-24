/*
Faça um programa que leia um nome de usuário e a sua senha e
não aceite a senha igual ao nome do usuário, mostrando uma
mensagem de erro e voltando a pedir as informações.
 */
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        do{
            System.out.println("Digite seu usuário:");
            usuario = sc.nextLine();
            System.out.println("Digite sua senha:");
            senha = sc.nextLine();
            if(Objects.equals(senha, usuario)){
                System.out.println("A senha não pode ser igual ao usuário. Tente novamente.");
            }
        }while(Objects.equals(senha, usuario));

        sc.close();

    }
}
