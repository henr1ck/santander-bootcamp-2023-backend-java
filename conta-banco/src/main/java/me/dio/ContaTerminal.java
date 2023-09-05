package me.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.print("Digite o número da conta: ");
            final int numero = input.nextInt();

            System.out.print("Digite o número da agência: ");
            final String agencia = input.next();

            System.out.print("Digite o seu nome: ");
            final String nome = input.next();

            System.out.print("Digite o saldo inicial da conta: ");
            final double saldo = input.nextDouble();

            System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                    " conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);

        } catch (InputMismatchException exception){
            System.out.print("Ocorreu um erro durante a criação da conta. Por favor, Revise os campos informados");

        } catch (RuntimeException exception){
            System.out.format("Erro desconhecido :(%nEntre em contato com os adminitradores!");
        }
    }

}
