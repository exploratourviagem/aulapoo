package aula6ed;

import java.util.ArrayList;

public class PessoaArray {
	
	pessoa pes;
	ArrayList<pessoa> vet = new ArrayList<pessoa>();
	
	void salvar(pessoa p) {
		vet.add(p);
	}
	
	void listar() {
		for(pessoa p: vet) {
		System.out.println("\nO nome: "+p.getNome()
							+"\nA idade: "+p.getIdade()
							+"\nO salario: "+p.getSalario());
		}
	}
	
	void excluir (int cod) {
		cod = cod-1;
		vet.remove(cod);
	}
	
	pessoa buscar(int cod) {
		cod--;
		return vet.get(cod);
	}
	
	void alterar (int cod, pessoa pes) {
		cod --;
		vet.set(cod, pes);
	}
}
