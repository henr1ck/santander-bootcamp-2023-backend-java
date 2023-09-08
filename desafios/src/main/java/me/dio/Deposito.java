package me.dio;

import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        do {
            valor = scanner.nextDouble();
            if (valor > 0) {
                System.out.format("Deposito realizado com sucesso!%nSaldo atual: R$ %.2f%n", valor);
            } else if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            } else {
                System.out.println("Encerrando o programa...");
            }
        } while(valor < 0);
    }
}
