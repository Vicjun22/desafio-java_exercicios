package service;

import exercicios.Nivel1;

import java.util.Objects;

public class Nivel1Service {

    Nivel1 nivel1 = new Nivel1();

    public void exercicio1() {

        String response = nivel1.exercicio1();

        System.out.println("Exercício 1:");

        if (Objects.nonNull(response) && !response.isEmpty()) {
            System.out.printf("Continue assim!%n%n");
        } else {
            System.out.printf("Resposta inválida.%n%n");
        }
    }

    public void exercicio2() {

        double valor = (Math.random() * 10) + 1;

        int response = nivel1.exercicio2(valor);
        int valorEmInteiro = (int) valor;

        System.out.println("Exercício 2:");

        if (valorEmInteiro == response) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d.%n%n", response, valorEmInteiro);
        }
    }

    public void exercicio3() {

        String[] palavras = { "B", "Z", "I", "A", "M" };

        int posicaoPalavraSorteada = (int) (Math.random() * 5);
        String palavraSorteada = palavras[posicaoPalavraSorteada];

        Character response = nivel1.exercicio3(palavraSorteada);
        Character respostaEsperada = palavraSorteada.charAt(0);

        if (Objects.equals(response, respostaEsperada)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta está incorreta, tente novamente!%n%n");
        }
    }

    public void exercicio4() {

        String[] palavras = { "automóvel", "lanterna", "escola", "programação", "java" };

        int posicaoPalavraSorteada = (int) (Math.random() * 5);
        String palavraSorteada = palavras[posicaoPalavraSorteada];

        String response = nivel1.exercicio4(palavraSorteada);
        String respostaEsperada = palavraSorteada.toUpperCase();

        if (Objects.equals(response, respostaEsperada)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta está incorreta, tente novamente!%n%n");
        }
    }

    public void exercicio5() {

        String[] palavras = { "automóvel", "lanterna", "escola", "programação", "java" };

        int posicaoPalavraSorteada = (int) (Math.random() * 5);
        String palavraSorteada = palavras[posicaoPalavraSorteada];

        Integer response = nivel1.exercicio5(palavraSorteada);
        Integer respostaEsperada = palavraSorteada.length();

        if (Objects.equals(response, respostaEsperada)) {
            System.out.printf("Resposta correta!%n%n");
        } else {
            System.out.printf("Sua resposta está incorreta, tente novamente!%n%n");
        }
    }
}
