package service;

import exercicios.Nivel2;

import java.util.Objects;

public class Nivel2Service {

    Nivel2 nivel2 = new Nivel2();

    public void exercicio1() {

        int valor1 = (int) (Math.random() * 10) + 1;
        int valor2 = (int) (Math.random() * 10) + 1;
        int valor3 = (int) (Math.random() * 10) + 1;

        Integer response = nivel2.exercicio1(valor1, valor2, valor3);
        Integer mediaFinal = (valor1 + valor2 + valor3) / 3;

        System.out.println("Exercício 1:");

        if (Objects.equals(response, mediaFinal)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", response, mediaFinal);
        }
    }

    public void exercicio2() {

        int anos = (int) (Math.random() * 11);
        int meses = (int) (Math.random() * 13);
        int dias = (int) (Math.random() * 30) + 1;

        Integer response = nivel2.exercicio2(anos, meses, dias);
        Integer qtdDiasPercorridos = (anos * 365) + (meses * 30) + dias;

        System.out.println("Exercício 2:");

        if (Objects.equals(response, qtdDiasPercorridos)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d dias e deveria ser %d dias percorridos.%n%n", response, qtdDiasPercorridos);
        }
    }

    public void exercicio3() {

        int celsius = (int) (Math.random() * 36) - 5;

        Double response = nivel2.exercicio3(celsius);
        Double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Exercício 3:");

        if (Objects.equals(response, fahrenheit)) {
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

        Character response = nivel2.exercicio4(palavraSorteada, posicaoCaractereSorteado);
        char caractereSorteado = palavras[posicaoPalavraSorteada].charAt(posicaoCaractereSorteado);
        Character caractereSorteadoMinusculo = Character.toLowerCase(caractereSorteado);

        System.out.println("Exercício 4:");

        if (Objects.equals(response, caractereSorteadoMinusculo)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("A palavra era %s. Sua resposta foi %c e deveria ser %c.%n%n", palavras[posicaoPalavraSorteada], response, caractereSorteadoMinusculo);
        }
    }

    public void exercicio5() {

        int[] valores = { 1, 4, 9, 16, 25, 36, 49, 56, 91, 100 };

        int posicaoValorSorteado = (int) (Math.random() * 10);

        Integer response = nivel2.exercicio5(valores[posicaoValorSorteado]);
        Integer raizQuadrada = (int) Math.sqrt(valores[posicaoValorSorteado]);

        System.out.println("Exercício 5:");

        if (Objects.equals(response, raizQuadrada)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", response, raizQuadrada);
        }
    }
}
