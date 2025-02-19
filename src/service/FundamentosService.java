package service;

import static exercicios.Nivel1.*;

public class FundamentosService {

    Nivel1Service nivel1Service = new Nivel1Service();

    public void executarExercicios() {
        boolean executarExercicios1Ao5 = executarExercicio1 || executarExercicio2 || executarExercicio3
                || executarExercicio4 || executarExercicio5;

        if (executarExercicios1Ao5) {
            System.out.print("Fundamentos JAVA - Exercícios de Nível 1\n\n");

            if (executarExercicio1) nivel1Service.exercicio1();
            if (executarExercicio2) nivel1Service.exercicio2();
            if (executarExercicio3) nivel1Service.exercicio3();
            if (executarExercicio4) nivel1Service.exercicio4();
            if (executarExercicio5) nivel1Service.exercicio5();
        }
    }
}
