package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.println("Digite uma op��o:2 ");
        System.out.println();

		
		System.out.println("Voc� tem quantos anos de experi�ncia profissional? 3");
		System.out.println("Voc� tem disponibilidade para viajar (s/n)? n");
		System.out.println("Voc� tem habilita��o de motorista (s/n)? s");
		System.out.println();
		
		System.out.println("Pontos por escolaridade: 20");
		System.out.println("Pontos por experi�ncia: 15");
		System.out.println();
		
		System.out.println("Voc� est� habilitado para o(s) seguintes(s) cargo(o): ");
		System.out.println("ASSISTENTE");
		
	}
}