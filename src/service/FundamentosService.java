package service;

import fundamentos.Fundamentos;

public class FundamentosService {

    Fundamentos fundamentos = new Fundamentos();

    public void exercicio1() {

        int valor1 = (int) (Math.random() * 10) + 1;
        int valor2 = (int) (Math.random() * 10) + 1;
        int valor3 = (int) (Math.random() * 10) + 1;

        int response = fundamentos.exercicio1(valor1, valor2, valor3);
        int mediaFinal = (valor1 + valor2 + valor3) / 3;

        System.out.println("Exercício 1:");

        if (mediaFinal == response) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", response, mediaFinal);
        }
    }

    public void exercicio2() {

        int anos = (int) (Math.random() * 11);
        int meses = (int) (Math.random() * 13);
        int dias = (int) (Math.random() * 30) + 1;

        int response = fundamentos.exercicio2(anos, meses, dias);
        int qtdDiasPercorridos = (anos * 365) + (meses * 30) + dias;

        System.out.println("Exercício 2:");

        if (response == qtdDiasPercorridos) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d dias e deveria ser %d dias percorridos.%n%n", response, qtdDiasPercorridos);
        }
    }

    public void exercicio3() {

        int celsius = (int) (Math.random() * 36) - 5;

        double response = fundamentos.exercicio3(celsius);
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Exercício 3:");

        if (response == fahrenheit) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %.1fF e deveria ser %.1fF.%n%n", response, fahrenheit);
        }
    }

    public void exercicio4() {

        String[] palavras = { "bAnAnA", "aBACAXI", "LarAnjA", "Morango", "Uva" };

        int posicaoPalavraSorteada = (int) (Math.random() * 5);
        int posicaoCaractereSorteado = (int) (Math.random() * palavras[posicaoPalavraSorteada].length());

        String palavraSorteada = palavras[posicaoPalavraSorteada];

        char response = fundamentos.exercicio4(palavraSorteada, posicaoCaractereSorteado);
        char caractereSorteado = palavras[posicaoPalavraSorteada].charAt(posicaoCaractereSorteado);
        char caractereSorteadoMinusculo = Character.toLowerCase(caractereSorteado);

        System.out.println("Exercício 4:");

        if (response == caractereSorteadoMinusculo) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("A palavra era %s. Sua resposta foi %c e deveria ser %c.%n%n", palavras[posicaoPalavraSorteada], response, caractereSorteadoMinusculo);
        }
    }

    public void exercicio5() {

        int[] valores = { 1, 4, 9, 16, 25, 36, 49, 56, 91, 100 };

        int posicaoValorSorteado = (int) (Math.random() * 10);

        int response = fundamentos.exercicio5(valores[posicaoValorSorteado]);
        int raizQuadrada = (int) Math.sqrt(valores[posicaoValorSorteado]);

        System.out.println("Exercício 5:");

        if (response == raizQuadrada) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", response, raizQuadrada);
        }
    }

}
