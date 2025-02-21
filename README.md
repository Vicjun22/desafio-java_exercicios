# Fundamentos JAVA - Exercícios

Este repositório contém uma série de exercícios básicos para praticar exercicios da linguagem Java. O objetivo deste projeto é fornecer um ambiente onde os usuários possam praticar e melhorar suas habilidades em Java, com foco nos conceitos fundamentais, como variáveis, laços de repetição, estruturas condicionais e manipulação de dados.

É recomendado que possua um breve conhecimento sobre classes e métodos ou que esteja acompanhado de alguém com estes conhecimentos.

<br><hr>

## Exercícios
Os exercícios implementados até o momento são:

### NÍVEL 1
<strong>Retorno de String</strong> - Retorne no método abaixo o seu nome no formato adequado.

<strong>Conversão de valores de tipos diferentes</strong> - Converta corretamente o valor 'a', vindo por parâmetro, do tipo double para o tipo int.

<strong>Conversão de valores de tipos diferentes</strong> - Converta a String 'palavra' que contém 1 caractere para o tipo char.

<strong>De minúsculo para maiúsculo</strong> - Converta a palavra vinda por parâmetro com caracteres minúsculos para maiúsculos (converta todos os caracteres).

<strong>Tamanho da palavra</strong> - Informe o tamanho da palavra vinda por parâmetro.

### NÍVEL 2
<strong>Média Aritmética</strong> - Calculando a média de três números inteiros.

<strong>Idade em Dias</strong> - Calculando a quantidade total de dias com base em anos, meses e dias.

<strong>Conversão de Temperatura</strong> - Convertendo valores de Celsius para Fahrenheit.

<strong>Caractere Aleatório</strong> - Extraindo um caractere aleatório em minúsculo de uma palavra sorteada.

<strong>Raiz Quadrada</strong> - Calculando a raiz quadrada de um número fornecido.

### NÍVEL 3
Em construção...

<br><hr>

## Estrutura do Projeto
O projeto é dividido em três pacotes principais:

<strong>service:</strong> Contém a lógica de execução dos exercícios e comparação das respostas.

<strong>exercicios:</strong> Contém as definições dos exercícios e suas implementações.

<strong>application:</strong> A classe principal que executa o programa.

<br><hr>

## Como Executar
Para rodar os exercícios no seu ambiente local, siga as instruções abaixo:

1. O projeto foi desenvolvido em Java. Será necessária a instalação do JDK (Java Development Kit). Caso não tenha o JDK instalado, você pode baixá-lo [aqui](https://www.oracle.com/java/technologies/downloads/#java11?er=221886).

   * Certifique-se de que a variável de ambiente `JAVA_HOME` esteja configurada corretamente.


2. Navegue até o diretório do projeto, abra a classe Application e execute o código.

   * Isso vai executar os exercícios e imprimir no terminal as respostas corretas e incorretas, dependendo dos valores aleatórios gerados.


3. Você pode alterar quais exercícios serão executados editando os valores das variáveis globais.

   * Por exemplo, para executar apenas o Exercício 3 do Nivel1, altere a variável correspondente para true:

```
   ANTES:
   public static boolean executarExercicio3 = false;
   
   DEPOIS:
   public static boolean executarExercicio3 = true;

```

<br><hr>

## Contribuições
Se você tiver sugestões ou encontrar problemas, sinta-se à vontade para abrir um issue.

