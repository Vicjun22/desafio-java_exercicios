import service.FundamentosService;

public class Application {
    public static void main(String[] args) {

            FundamentosService fundamentosService = new FundamentosService();

            System.out.print("Exercícios JAVA - Fundamentos\n\n");

            fundamentosService.exercicio1();
            fundamentosService.exercicio2();
            fundamentosService.exercicio3();
            fundamentosService.exercicio4();
            fundamentosService.exercicio5();
    }
}