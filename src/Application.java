import fundamentos.Fundamentos;

public class Application {
    public static void main(String[] args) {

        Fundamentos fundamentos = new Fundamentos();

        int mediaAritmetica1 = (int) (Math.random() * 10) + 1;
        int mediaAritmetica2 = (int) (Math.random() * 10) + 1;
        int mediaAritmetica3 = (int) (Math.random() * 10) + 1;

        int response = fundamentos.exercicio1(mediaAritmetica1, mediaAritmetica2, mediaAritmetica3);
        int mediaFinal = (mediaAritmetica1 + mediaAritmetica2 + mediaAritmetica3) / 3;

        if (mediaFinal == response) {
            System.out.printf("A resposta está correta!%n");
        } else {
            System.out.printf("Sua resposta foi %d e deveria ser %d%n", response, mediaFinal);
        }

    }
}