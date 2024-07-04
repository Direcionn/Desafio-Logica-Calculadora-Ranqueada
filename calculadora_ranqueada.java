import java.util.Scanner;
public class calculadora_ranqueada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vitorias;
        int derrotas;
        String patente;

        System.out.println("Digite o seu número de vitorias: ");
        vitorias = scanner.nextInt();

        System.out.println("Digite o número de derrotas: ");
        derrotas = scanner.nextInt();

        int saldo = calcularSaldo(vitorias, derrotas);

        if (saldo<=10) {
            patente = "Ferro";
        }else if (saldo>=11&&saldo<=20) {
            patente = "Bronze";
        }else if (saldo>=21&&saldo<=50) {
            patente = "Prata";
        }else if (saldo>=51&&saldo<=80) {
            patente = "Ouro";
        }else if (saldo>=81&&saldo<=90) {
            patente = "Diamante";
        }else if (saldo>=91&&saldo<=100) {
            patente = "Lendário";
        }else{
            patente = "Imortal";
        }

        System.out.println("O héroi tem saldo de "+saldo+" vitorias e está na patente "+patente+" do ranking.");

        scanner.close();
    }

    static int calcularSaldo(int vitorias, int derrotas){
        int saldo = vitorias - derrotas;
        return saldo;
    }
}
