package aula_8;

import javax.swing.*;
import java.util.ArrayList;

public class PessoaDao {

    ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    Pessoa pes;
    void salvar(Pessoa p){
        lista.add(p);
    }

    void listar(){
        for (Pessoa p: lista){
            JOptionPane.showMessageDialog(null,
                    "O nome:"+ p.getNome()
                    + "\nA Idade:"+ p.getIdade()
                    + "\nA Renda:"+ p.getNome());

        }
    }

    Pessoa pesquisar(int cod){
        cod--;
        pes = lista.get(cod);
        return pes;
    }

    void alterar(int cod, Pessoa p){
        cod--;
        lista.set(cod, p);
    }

    void excluir(int cod){
        cod--;
        lista.remove(cod);
    }
}
