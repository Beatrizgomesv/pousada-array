package aplicação;

import java.util.Scanner;

import entidades.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);	
Aluguel [] vetor = new Aluguel [10];

System.out.println("Seja bem vindo a pousada Belo Mar.");
System.out.println("Digite o numero de quartos a serem reservados: ");
int n = sc.nextInt();

for(int i=1; i<=n; i++) {
System.out.println();
System.out.println("Alugar #" + i + ":");
System.out.println("Nome: " );
sc.nextLine();
String nome = sc.nextLine();
System.out.print("Email: ");
String email = sc.nextLine();
System.out.println("Quarto: ");
int quarto = sc.nextInt();
vetor[quarto] = new Aluguel (nome,email);

	}
System.out.println();
System.out.println("Quartos indisponiveis no momento: ");
	for (int i=0; i<10; i++) {
		if (vetor[i] != null) {
			System.out.println(i);
		}
	}
sc.close();
	}

}
