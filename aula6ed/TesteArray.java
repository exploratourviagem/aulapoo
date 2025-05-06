package aula6ed;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
	
		pessoa pessoa;
		PessoaArray pa = new PessoaArray();
		String n="";
		int id=0, a=0, b=0, c=0;
		Double sal = 0.0;
		
		Scanner into = new Scanner(System.in);
		
		do {
			System.out.println("\n###MENU###");
			System.out.println("\n1 - CADASTRAR");
			System.out.println("\n2 - LISTAR");
			System.out.println("\n3 - PESQUISAR");
			System.out.println("\n4 - ALTERAR");
			System.out.println("\n5 - EXCLUIR");
			System.out.println("\nESCOLHA UMA OPÇÃO:");
			b = into.nextInt();
			switch (b) {
			case 1:
				System.out.println("\nMetodo cadastrar");
				System.out.println("\nDIGITE O NOME:");
				String n1 = into.next();
				System.out.println("\nDIGITE A IDADE:");
				Integer id1 = into.nextInt();
				System.out.println("\nDIGITE O SALARIO");
				Double s = into.nextDouble();
				pessoa = new pessoa (n, id, s);
				pa.salvar(pessoa);
				System.out.println("PESSOA SALVA COM SUCESSO");
				break;
			case 2:
				System.out.println("\nMETODO LISTAR");
				pa.listar();
				break;
			case 3:
				System.out.println("\nMETODO BUSCAR");
				System.out.println("\nDIGITE O CODIGO P/ REALIZAR A BUSCA");
				c = into.nextInt();
				pessoa = new pessoa();
				pessoa = pa.buscar(c);
				System.out.println("\nENCONTREI");
				System.out.println("\nO Nome:"+pessoa.getNome());
				
				break;
			case 4:
				System.out.println("\nMETODO EXCLUIR");
				System.out.println("\nDIGITE O CODIGO P/ EXCLUIR");
				c = into.nextInt();
				
				pa.excluir(c);
				System.out.println("\nPESSOA EXCLUIDA");
			
				
				break;
		}
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair:");
			a = into.nextInt();
		}while (a !=0);
		
	
		

	}

}
