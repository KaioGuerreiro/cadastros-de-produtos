import classes.Produto;
import classes.ProdutoEletronico;
import classes.ProdutoRoupa;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto = new Produto();
        ProdutoEletronico eletronico = new ProdutoEletronico();
        ProdutoRoupa roupa = new ProdutoRoupa();

        Integer opcaoMenu;
        Integer opcaoCadastro;
        Integer taxa;

        do {
            opcaoMenu = Integer.valueOf(JOptionPane.showInputDialog("""
                    MENU OPCOES
                    1 - CADASTRAR
                    2 - LISTAR
                    3 - SAIR"""));
            switch (opcaoMenu){
                case 1:
                    opcaoCadastro = Integer.parseInt(JOptionPane.showInputDialog("""
                            MENU DE CADASTRO
                            1 - PRODUTO GENERICO
                            2 - ELETRONICO
                            3 - ROUPA"""));
                    switch (opcaoCadastro){
                        case 1:
                            produto.setNome(JOptionPane.showInputDialog("INFORME O NOME DO PRODUTO"));
                            produto.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            produto.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            produtos.add(produto);
                            JOptionPane.showMessageDialog(null,"PRODUTO CADASTRADO  :)");
                            break;
                        case 2:
                            eletronico.setNome(JOptionPane.showInputDialog("INFORME O NOME DO ELETRONICO"));
                            eletronico.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            eletronico.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            eletronico.setEspecificacao(JOptionPane.showInputDialog("INFORME AS ESPECIFICAÇÕES"));
                            produtos.add(eletronico);
                            JOptionPane.showMessageDialog(null,"ELETRONICO CADASTRADO  :)");
                            break;
                        case 3:
                            roupa.setNome(JOptionPane.showInputDialog("INFORME O NOME DA ROUPA"));
                            roupa.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            roupa.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            roupa.setTamanho(JOptionPane.showInputDialog("INFORME O TAMANHO DA ROUPA"));
                            produtos.add(roupa);
                            JOptionPane.showMessageDialog(null,"ROUPA CADASTRADA  :)");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!");
                    }
                    break;
                case 2:
                    if (produtos.isEmpty())
                        JOptionPane.showMessageDialog( null, "NENHUM PRODUTO CADASTRADO");

                    taxa = Integer.parseInt(JOptionPane.showInputDialog("INFORME A TAXA DE DESCONTO, DIGITE APENAS O NUMERO"));
                    for(int i = 0; i < produtos.size(); i++){
                        if(produtos.get(i).equals(produto)) {
                            JOptionPane.showMessageDialog(null, "N-"+(i+1)
                                    + "\nPRODUTO GENERICO"
                                    +"\nNOME: "+produtos.get(i).getNome()
                                    +"\nPREÇO: "+ produtos.get(i).getPreco()
                                    +"\nPREÇO DESCONTO: "+ produtos.get(i).calcularDesconto(taxa)
                                    +"\nMARCA: "+ produtos.get(i).getMarca());
                        } else if (produtos.get(i).equals(eletronico)) {
                            JOptionPane.showMessageDialog(null, "N-"+(i+1)
                                    +"\nELETRONICO"
                                    + "\nNOME: " + produtos.get(i).getNome()
                                    + "\nPREÇO: " + produtos.get(i).getPreco()
                                    +"\nPREÇO DESCONTO: "+ produtos.get(i).calcularDesconto(taxa)
                                    + "\nMARCA: " + produtos.get(i).getMarca());
                        } else {
                            JOptionPane.showMessageDialog(null, "N-"+(i+1)
                                    +"\nROUPA"
                                    +"\nNOME: "+produtos.get(i).getNome()
                                    +"\nPREÇO: "+ produtos.get(i).getPreco()
                                    +"\nPREÇO DESCONTO: "+ produtos.get(i).calcularDesconto(taxa)
                                    +"\nMARCA: "+ produtos.get(i).getMarca());
                        }
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"FIM DO PROGRAMA!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCÃO INVALIDA!");
            }

        } while (opcaoMenu != 3);

    }
}