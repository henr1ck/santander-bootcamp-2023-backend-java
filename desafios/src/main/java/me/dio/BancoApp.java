package me.dio;

import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        double juros = 1;
        for(int t = 0; t < periodo; t++){
            juros = juros * (1+taxaJuros);
        }
        var valorFinal = valorInicial * juros;
        System.out.format("Valor final do investimento: R$ %.2f",valorFinal);

        scanner.close();
    }
}
