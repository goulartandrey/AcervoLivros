package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Editora e1 = new Editora();
		char op;
		do {
			Livro l1 = new Livro();
			System.out.println("Digite o título do livro: ");
			l1.setTitulo(sc.nextLine());
			System.out.println("Digite o nome do autor: ");
			l1.setAutor(sc.nextLine());
			System.out.println("Digite o ID da editadora: ");
			l1.setIdEditora(sc.nextInt());
			System.out.println("Digite o ano:");
			l1.setAno(sc.nextInt());
			e1.adicionar(l1);
			System.out.println("Deseja cadastrar outro livro?");
			op=sc.next().charAt(0);
			sc.nextLine();
		}while(op =='s');
		System.out.println("Lista até agora: " + e1.getLista());
	}

}
