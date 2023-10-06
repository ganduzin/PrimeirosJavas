package edu.ganduzin.java;

public class BoletimEstudantil {
    public static void main(String[] args) throws Exception {
        double nota = 7;
        if (nota < 5)
            System.out.print("REPROVADO");
        else if (nota >= 5 && nota < 7)
            System.out.print("RECUPERAÇÃO");
        else
            System.out.print("APROVADO");
    }

}
