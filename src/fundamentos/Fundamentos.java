package fundamentos;

public class Fundamentos {

    // Encontre a média aritmética de 3 valores inteiros distindos vindos por parâmetro.
    // O resultado deverá coincidir com o resultado mostrado no terminal.
    // O resultado deverá ser também um número inteiro.
    public int exercicio1(int a, int b, int c) {
        int resultado = 0;

        // escreva seu código abaixo:
        resultado = (a + b + c) / 3;

        return resultado;
    }

    // Faça um algoritmo que leia a idade de uma pessoa em dias.
    // Considere o ano com 365 dias e os meses com 30 dias.
    // Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.
    public int exercicio2(int ano, int mes, int dia) {
        int resultado = 0;

        // escreva seu código abaixo:
        resultado = (ano * 365) + (mes * 30) + dia;

        return resultado;
    }

}