public class Emprestimo {

    //Parcelas
    public static int duasparcelas() {
        return 2;
    }

    public static int tresparcelas() {
        return 3;
    }

    //Taxas
    public static double taxaduasparcelas() {
        return 0.3;
    }

    public static double taxatresparcelas() {
        return 0.45;
    }

    //Calculo
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double resultado = valor + (valor * taxaduasparcelas());
            System.out.println("O valor da segunda parcela do emprestimo é " + resultado + "\n");
        } else if (parcelas == 3) {
            double resultado = valor + (valor * taxatresparcelas());
            System.out.println("O valor da terceira parcela do emprestimo é " + resultado + "\n");
        } else {
            System.out.println("Valor inválido");
        }
    }


}
