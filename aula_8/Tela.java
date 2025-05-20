package aula_8;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Tela implements ActionListener{

    Pessoa pes;
    PessoaDao pd = new PessoaDao();

    JFrame tela = new JFrame("Cadastro de Pessoa");
    JPanel painel = new JPanel();

    JLabel lbcod = new JLabel("Codigo:");
    JLabel lbnome = new JLabel("Nome:");
    JLabel lbidade = new JLabel("Idade:");
    JLabel lbrenda = new JLabel("Renda:");

    JTextField txtcod = new JTextField();
    JTextField txtnome = new JTextField();
    JTextField txtidade = new JTextField();
    JTextField txtrenda = new JTextField();

    JButton btsalvar = new JButton("Salvar");
    JButton btlistar = new JButton("Listar");
    JButton btalterar = new JButton("Alterar");
    JButton btexcluir = new JButton("Excluir");
    JButton btpesquisar = new JButton("Pesquisar");

    void criarTela(){

        tela.setSize(500,500);
        tela.setLocation (550, 250);
        painel.setLayout(null);

        lbcod.setBounds(30, 10,100, 40);
        txtcod.setBounds(120,10,150,40);
        btpesquisar.setBounds(300, 10,100,40);
        btpesquisar.addActionListener(this);
        btpesquisar.enable();
        lbnome.setBounds(30,100,100,40);
        txtnome.setBounds(120, 100, 150, 30);
        lbidade.setBounds(30, 200, 150, 30);
        txtidade.setBounds(120, 200, 150, 30);
        lbrenda.setBounds(30, 300, 100, 40);
        txtrenda.setBounds(120, 300, 150, 30);
        btsalvar.setBounds(20, 400, 90,30);
        btsalvar.addActionListener(this);
        btlistar.setBounds(120, 400, 90,30);
        btsalvar.addActionListener(this);
        btalterar.setBounds(220, 400, 90, 30);
        btalterar.addActionListener(this);
        btexcluir.setBounds(320, 400, 90,30);
        btexcluir.addActionListener(this);


        painel.add(lbcod);
        painel.add(txtcod);
        painel.add(btpesquisar);
        painel.add(lbnome);
        painel.add(txtnome);
        painel.add(lbidade);
        painel.add(txtidade);
        painel.add(lbrenda);
        painel.add(txtrenda);
        painel.add(btsalvar);
        painel.add(btlistar);
        painel.add(btalterar);
        painel.add(btexcluir);


        tela.getContentPane().add(painel);
        tela.setVisible(true);
    }

    public static void main(String[] args){
        Tela t = new Tela();
        t.criarTela();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btsalvar){
            String n = txtnome.getText();
            Integer i = Integer.valueOf(txtidade.getText());
            Double r = Double.valueOf(txtrenda.getText());
            pes = new Pessoa(n, i, r);
            pd.salvar(pes);
            JOptionPane.showMessageDialog(null, "Objeto salvo com sucesso");

            txtnome.setText("");
            txtidade.setText("");
            txtrenda.setText("");


            btpesquisar.enable();
        }
        if (e.getSource() == btlistar){
            int cod = Integer.valueOf(txtcod.getText());
            pd.listar();
        }
        if (e.getSource() == btpesquisar){
            int cod = Integer.valueOf(txtcod.getText());

            pes = pd.pesquisar(cod);

            txtnome.setText(pes.getNome());
            txtidade.setText(String.valueOf(pes.getNome()));
            txtrenda.setText(String.valueOf(pes.getRenda()));
        }
        if (e.getSource() == btalterar){
            int cod = Integer.valueOf(txtcod.getText());

            String n = txtnome.getText();
            Integer i = Integer.parseInt(txtidade.getText());
            Double r = Double.valueOf(txtrenda.getText());
            pes = new Pessoa(n, i, r);

            pd.alterar(cod, pes);

            JOptionPane.showMessageDialog(null,"Objeto alterado");
            txtnome.setText("");
            txtidade.setText("");
            txtrenda.setText("");
        }
        if (e.getSource() == btexcluir){
            int cod = Integer.valueOf(txtcod.getText());

            pd.excluir(cod);
            JOptionPane.showMessageDialog(null,"Objeto deletado");
            txtnome.setText("");
            txtidade.setText("");
            txtrenda.setText("");
        }
    }
}
