package me.dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            final int parametroUm = input.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            final int parametroDois = input.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException expection){
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        } catch (InputMismatchException exception){
            System.out.println("Erro durante a entrada dos dados. Revise os campos digitados!");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else {
            final int contagem = parametroDois - parametroUm;
            for (int atual = 1; atual <= contagem; atual++){
                System.out.format("Imprimindo o número: %d%n", atual);
            }
        }

    }
}