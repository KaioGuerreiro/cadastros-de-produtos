import classes.Produto;
import classes.ProdutoEletronico;
import classes.ProdutoRoupa;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Integer opcaoMenu;
        Integer opcaoCadastro;

        do {
            opcaoMenu = Integer.valueOf(JOptionPane.showInputDialog("""
                    MENU OPCOES
                    1 - CADASTRAR
                    2 - LISTAR
                    3 - SAIR"""));
            switch (opcaoMenu) {
                case 1:
                    opcaoCadastro = Integer.parseInt(JOptionPane.showInputDialog("""
                            MENU DE CADASTRO
                            1 - PRODUTO GENERICO
                            2 - ELETRONICO
                            3 - ROUPA"""));
                    switch (opcaoCadastro) {
                        case 1:
                            // Criando um novo produto genérico
                            Produto produto = new Produto();
                            produto.setNome(JOptionPane.showInputDialog("INFORME O NOME DO PRODUTO"));
                            produto.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            produto.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            produtos.add(produto);
                            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO :)");
                            break;
                        case 2:
                            // Criando um novo produto eletrônico
                            ProdutoEletronico eletronico = new ProdutoEletronico();
                            eletronico.setNome(JOptionPane.showInputDialog("INFORME O NOME DO ELETRONICO"));
                            eletronico.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            eletronico.setTaxaDesconto(Integer.parseInt(JOptionPane.showInputDialog("INFORME A TAXA DE DESCONTO")));
                            eletronico.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            eletronico.setEspecificacao(JOptionPane.showInputDialog("INFORME AS ESPECIFICAÇÕES"));
                            produtos.add(eletronico);
                            JOptionPane.showMessageDialog(null, "ELETRONICO CADASTRADO :)");
                            break;
                        case 3:
                            // Criando uma nova roupa
                            ProdutoRoupa roupa = new ProdutoRoupa();
                            roupa.setNome(JOptionPane.showInputDialog("INFORME O NOME DA ROUPA"));
                            roupa.setPreco(Float.parseFloat(JOptionPane.showInputDialog("INFORME O PREÇO")));
                            roupa.setTaxaDesconto(Integer.parseInt(JOptionPane.showInputDialog("INFORME A TAXA DE DESCONTO")));
                            roupa.setMarca(JOptionPane.showInputDialog("INFORME A MARCA"));
                            roupa.setTamanho(JOptionPane.showInputDialog("INFORME O TAMANHO DA ROUPA"));
                            produtos.add(roupa);
                            JOptionPane.showMessageDialog(null, "ROUPA CADASTRADA :)");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!");
                    }
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NENHUM PRODUTO CADASTRADO");
                    } else {
                        for (Produto prod : produtos) {
                            if (prod instanceof ProdutoEletronico) {
                                ProdutoEletronico tempEletronico = (ProdutoEletronico) prod;
                                JOptionPane.showMessageDialog(null,
                                        "\nELETRONICO"
                                                + "\nNOME: " + tempEletronico.getNome()
                                                + "\nPREÇO: " + tempEletronico.getPreco()
                                                + "\nPREÇO DESCONTO: " + tempEletronico.calcularDesconto()
                                                + "\nMARCA: " + tempEletronico.getMarca()
                                                + "\nESPECIFICACAO: " + tempEletronico.getEspecificacao());
                            } else if (prod instanceof ProdutoRoupa) {
                                ProdutoRoupa tempRoupa = (ProdutoRoupa) prod;
                                JOptionPane.showMessageDialog(null,
                                        "\nROUPA"
                                                + "\nNOME: " + tempRoupa.getNome()
                                                + "\nPREÇO: " + tempRoupa.getPreco()
                                                + "\nPREÇO DESCONTO: " + tempRoupa.calcularDesconto()
                                                + "\nMARCA: " + tempRoupa.getMarca()
                                                + "\nTAMANHO: " + tempRoupa.getTamanho());
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "\nPRODUTO GENERICO"
                                                + "\nNOME: " + prod.getNome()
                                                + "\nPREÇO: " + prod.getPreco()
                                                + "\nMARCA: " + prod.getMarca());
                            }
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCÃO INVALIDA!");
            }
        } while (opcaoMenu != 3);
    }
}
