import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int dia, mes, ano;

        ClassData d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia()00/_/_");
        dia = sc.nextInt();

        System.out.println("Digite o mes(_/00/_)");
        mes = sc.nextInt();

        System.out.println("Digite o ano(_/_/0000)");
        ano = sc.nextInt();

        d = new ClassData(dia, mes, ano);

        System.out.println("Hoje é " + d.diaDaSemana() + " nesse mês tem " + d.diasNoMes() + " dias");
        System.out.println("Digite quantos dias você deseja avançar(Digite apenas o número)");
        d.adicionarDias(sc.nextInt());
        System.out.println("Será " + d.diaDaSemana() + " dia: " + d.getDia());
    }
}
