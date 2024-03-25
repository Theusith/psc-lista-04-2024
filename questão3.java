/*
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, tamanhoString;
        char sexo, estadCivil;
        double salario;
        String nome;

        // Validando nome
        do{
            System.out.println("Digite seu nome:");
            nome = sc.nextLine();
            tamanhoString = nome.length();
            if (tamanhoString <= 3){
                System.out.println("O nome precisa ter mais de 3 caracteres.");
            }
        }while(tamanhoString <= 3);

        // Validando Idade
        do{
            System.out.println("Digite sua idade:");
            idade = sc.nextInt();
            if(idade < 0 || idade > 150){
                System.out.println("Idade invalida, tente novamente.");
            }
        }while(idade < 0 || idade > 150);

        // validando salario
        do{
            System.out.println("Digite o seu salário:");
            salario = sc.nextDouble();
            if(salario == 0){
                System.out.println("Salário invalido, digite o salário novamente");
            }
        }while(salario == 0);

        //Validando sexo
        do{
            System.out.println("Digite seu sexo.'F' para mulher, 'M' para homem.");
            sexo = sc.next().charAt(0);


            if (sexo != 'M' && sexo != 'F'){
                System.out.println("Caracter invalido, tente novamente.");
            }
        }while(sexo != 'M' && sexo != 'F');

        do{
            System.out.println("Diga se estado civil:\n'S' para solteiro\n'C' para casado\n'V' para viuvo(a)\n'D' para divorciado" );
            estadCivil = sc.next().charAt(0);

            if (estadCivil  != 'S' && estadCivil != 'C' && estadCivil != 'V' && estadCivil != 'D' ) {
                System.out.println("Caracter invalido, tente novamente.");
            }
        }while(estadCivil  != 'S' && estadCivil != 'C' && estadCivil != 'V' && estadCivil != 'D' );

        // Mostrando Dados

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
        System.out.println(estadCivil);

        sc.close();

    }
}
