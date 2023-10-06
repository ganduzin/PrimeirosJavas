package edu.ganduzin.java;

public class NomeCompleto {
    public static void main(String[] args) {
        String nomeCompleto = juntarNomes("Daniel", "Gandour");
        System.out.print(nomeCompleto);
    }

    public static String juntarNomes (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
