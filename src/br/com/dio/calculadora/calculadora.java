package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {



        Scanner scan = new Scanner (System.in);

        int a, b;

        System.out.println("Digite o primeiro Numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo Numero: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        float divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);

        System.out.println("somar: " + somar);
        System.out.println("somar: " + subtracao);
        System.out.println("somar: " + divisao);
        System.out.println("somar: " + multiplicacao);
    }

    public static int somar(int a, int b){
        return a + b;

    }
    public static int subtracao(int a, int b){
        return a - b;

    }
    public static float divisao(float a, float b){
        return a / b;

    }
    public static int multiplicacao(int a, int b){
        return a * b;

    }

    private static class string {
    }
}
