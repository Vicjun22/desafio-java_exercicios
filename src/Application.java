import service.FundamentosService;

public class Application {
    public static void main(String[] args) {

        FundamentosService fundamentosService = new FundamentosService();

        fundamentosService.executarExercicios();
    }
}