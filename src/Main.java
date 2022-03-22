public class Main {
    public static void main(String[] args) {

        // Atividade Calculadora
        {
            System.out.println("Atividade da Calculadora \n");
            OperacoesAritmeticas.soma(10, 15.5);
            OperacoesAritmeticas.subtracao(15.5, 5);
            OperacoesAritmeticas.multiplicacao(10, 5);
            OperacoesAritmeticas.divisao(10, 5);
        }
        //Atividade Mensagem
        //Usando switch (usado pelo professor da Dio)
        {
            System.out.println("Atividade da Mensagem Switch \n");
            Mensagem.obterMensagem(5);
            Mensagem.obterMensagem(14);
            Mensagem.obterMensagem(22);
        }

        //Usando If (Código Refatorado )
        {
            System.out.println("Atividade da Mensagem If \n");
            Mensagem.mensagemIf(9);
            Mensagem.mensagemIf(16);
            Mensagem.mensagemIf(21);
        }
        //Atividade Emprestimo
        {
            System.out.println("Atividade do Empréstimo \n");
            Emprestimo.calcular(1000, Emprestimo.duasparcelas());
            Emprestimo.calcular(1000, Emprestimo.tresparcelas());
            Emprestimo.calcular(1000, 5);

        }
    }
}