public class Mensagem {

    public static void obterMensagem(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();

                break;
            default:
                System.out.println("Hora Inválida \n");
                break;
        }

    }

    public static void mensagemIf(int hora) {
        //hora tem que ser maior igual que 5 e menor igual a 12

        if (hora >= 5 && hora <= 12) {
            mensagemBomDia();
        } else if (hora >= 13 && hora <= 18) {
            mensagemBoaTarde();
        } else if ((hora >= 19 && hora <= 24) || hora >= 1 && hora <= 4) {
            mensagemBoaNoite();
        } else System.out.println("Hora inválida \n");
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia \n");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde \n");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite \n");
    }
}


