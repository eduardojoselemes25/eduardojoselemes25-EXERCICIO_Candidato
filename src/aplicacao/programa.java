package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.println("Digite uma opção:2 ");
        System.out.println();

		
		System.out.println("Você tem quantos anos de experiência profissional? 3");
		System.out.println("Você tem disponibilidade para viajar (s/n)? n");
		System.out.println("Você tem habilitação de motorista (s/n)? s");
		System.out.println();
		
		System.out.println("Pontos por escolaridade: 20");
		System.out.println("Pontos por experiência: 15");
		System.out.println();
		
		System.out.println("Você está habilitado para o(s) seguintes(s) cargo(o): ");
		System.out.println("ASSISTENTE");
		
	}
}