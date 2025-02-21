package service;

import exercicios.Nivel1;
import exercicios.Nivel2;

public class FundamentosService {

    Nivel1Service nivel1Service = new Nivel1Service();
    Nivel2Service nivel2Service = new Nivel2Service();

    public void executarExercicios() {
        executarExerciciosNivel1();
        executarExerciciosNivel2();
    }

    public void executarExerciciosNivel1() {
        boolean executarExercicios1Ao5DoNivel1 = Nivel1.executarExercicio1 || Nivel1.executarExercicio2
                || Nivel1.executarExercicio3 || Nivel1.executarExercicio4 || Nivel1.executarExercicio5;

        if (executarExercicios1Ao5DoNivel1) {
            System.out.print("Fundamentos JAVA - Exercícios de Nível 1\n\n");

            if (Nivel1.executarExercicio1) nivel1Service.exercicio1();
            if (Nivel1.executarExercicio2) nivel1Service.exercicio2();
            if (Nivel1.executarExercicio3) nivel1Service.exercicio3();
            if (Nivel1.executarExercicio4) nivel1Service.exercicio4();
            if (Nivel1.executarExercicio5) nivel1Service.exercicio5();
        }
    }

    public void executarExerciciosNivel2() {
        boolean executarExercicios1Ao5DoNivel2 = Nivel2.executarExercicio1 || Nivel2.executarExercicio2
                || Nivel2.executarExercicio3 || Nivel2.executarExercicio4 || Nivel2.executarExercicio5;

        if (executarExercicios1Ao5DoNivel2) {
            System.out.print("Fundamentos JAVA - Exercícios de Nível 2\n\n");

            if (Nivel2.executarExercicio1) nivel2Service.exercicio1();
            if (Nivel2.executarExercicio2) nivel2Service.exercicio2();
            if (Nivel2.executarExercicio3) nivel2Service.exercicio3();
            if (Nivel2.executarExercicio4) nivel2Service.exercicio4();
            if (Nivel2.executarExercicio5) nivel2Service.exercicio5();
        }
    }
}
