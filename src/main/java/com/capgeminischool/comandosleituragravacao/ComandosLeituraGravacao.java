package com.capgeminischool.comandosleituragravacao;

import java.util.Scanner;

public class ComandosLeituraGravacao{

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //ler linha de texto
        String codigoRua = leitor.next();  //le uma palvra só

        System.out.println("Texto que será exibido no console"); // imprime e pula linha
        System.out.print("Texto que será exibido no console");// só imprime

    }
}

