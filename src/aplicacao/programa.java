package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int totalEscolaridade = 0;
		int totalExper = 0;

		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		int opcao = sc.nextInt();
		if (opcao == 1) {
			totalEscolaridade += 10;
		} else if (opcao == 2) {
			totalEscolaridade += 20;
		} else if (opcao == 3) {
			totalEscolaridade += 30;
		} else if (opcao == 4) {
			totalEscolaridade += 40;
		} else {
			totalEscolaridade += 0;
		}

		System.out.println();
		System.out.print("Você tem quantos anos de experiência profissional? ");
		int exper = sc.nextInt();
		if (exper == 0) {
			totalExper += 0;
		} else if (exper <= 2) {
			totalExper += 10;
		} else if (exper <= 5) {
			totalExper += 20;
		} else if (exper > 5) {
			totalExper += 40;
		} else {
			totalExper += 0;
		}
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		char dispo = sc.next().toUpperCase().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		char habilitacao = sc.next().toUpperCase().charAt(0);
		System.out.println();

		System.out.println("Pontos por escolaridade: " + totalEscolaridade);
		System.out.println("Pontos por experiência: " + totalExper);

		System.out.println();
		if (totalEscolaridade <= 10) {
			System.out.println("Infelismente seu perfil não atende a empresa");
		} else {
			System.out.println("Você está habilitado para o(s) seguintes(s) cargo(o): ");
			if (totalEscolaridade >= 20 && habilitacao == 'S') {
				System.out.println("ASSISTENTE");
			} else if (totalExper >= 20 && totalEscolaridade >= 30) {
				System.out.println("Gerente");
			}  if (totalExper >= 40 && dispo == 'S' && totalEscolaridade >= 30) {
				System.out.println("Analista");
			}

		}

	}
}