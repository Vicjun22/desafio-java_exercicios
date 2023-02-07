package service;

import fundamentos.Fundamentos;

public class FundamentosService {

    Fundamentos fundamentos = new Fundamentos();

    public void exercicio1() {

        int mediaAritmetica1 = (int) (Math.random() * 10) + 1;
        int mediaAritmetica2 = (int) (Math.random() * 10) + 1;
        int mediaAritmetica3 = (int) (Math.random() * 10) + 1;

        int responseMediaAritmetica = fundamentos.exercicio1(mediaAritmetica1, mediaAritmetica2, mediaAritmetica3);
        int mediaFinal = (mediaAritmetica1 + mediaAritmetica2 + mediaAritmetica3) / 3;

        System.out.println("Exercício 1:");

        if (mediaFinal == responseMediaAritmetica) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", responseMediaAritmetica, mediaFinal);
        }
    }

    public void exercicio2() {

        int anos = (int) (Math.random() * 11);
        int meses = (int) (Math.random() * 13);
        int dias = (int) (Math.random() * 30) + 1;

        int responseQtdDiasPercorridos = fundamentos.exercicio2(anos, meses, dias);
        int qtdDiasPercorridos = (anos * 365) + (meses * 30) + dias;

        System.out.println("Exercício 2:");

        if (responseQtdDiasPercorridos == qtdDiasPercorridos) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d dias e deveria ser %d dias percorridos.%n%n", responseQtdDiasPercorridos, qtdDiasPercorridos);
        }
    }

}
