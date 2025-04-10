package br.fiap.util;

import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Util {

    private Produto[] produto = new Produto[2];
    private Fornecedor[] fornecedor = new Fornecedor[2];
    private int indexProduto = 0;
    private int indexFornecedor = 0;

    public void MenuPrincipal(){
        int opcao=0;
        String msg = "1. Cadastrar Produto " +
                "\n2. Pesquisar Produto por nome " +
                "\n3. Pesquisar Fornecedor por CNPJ " +
                "\n4. Finalizar";

        while (true){
            opcao = parseInt(showInputDialog(msg));

            switch (opcao){
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    return;
                default:
                    showMessageDialog(null, "*OPÇÃO INVÁLIDA*");
            }

        }

    }//// MENU PRINCIPAL

    private void pesquisar (){
        String aux = "";
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor != null){
            aux += "Fornecedor: " + fornecedor.getNome() + "\n";
            aux += "CNPJ: " + fornecedor.getCnpj() + "\n";
            showMessageDialog(null, aux);
        }
    }


    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do Fornecedor"));
        for (int i= 0; i< indexFornecedor; i++){
            if (fornecedor[i].getCnpj()== cnpj){
                return fornecedor[i];
            }
        }

        showMessageDialog(null,"CNPJ NÃO CADASTRADO");
        return null;
    }

    private void pesquisarProduto() {
        String aux = "PRODUTO NÃO ENCONTRADO";
        String nome = showInputDialog("Nome do Produto");

        for (int i=0; i<indexProduto; i++){
            if (produto[i].getNomeProduto().equalsIgnoreCase(nome)){
                aux = "";
                aux += "Nome do Produto: "+ nome + "\n";
                aux += "Valor Unitário:  R$ "+ produto[i].getValorUni() + "\n";
                aux += "Fornecedor: "+ produto[i].getFornecedor().getNome() + "\n";
            }
        }
        showMessageDialog(null, aux);
    }

    private void cadastrarProduto() {
        pesquisarFornecedor();
        String nomeProduto;
        double valorUni;
        int quantEst;
        Fornecedor fornecedor = pesquisarFornecedor();

        if (fornecedor == null ){
            fornecedor = cadastrarFornecedor();
        }

        nomeProduto = showInputDialog("Nome do Produto");
        quantEst = parseInt(showInputDialog("Quantidade em Estoque"));
        valorUni = parseDouble(showInputDialog("Valor Unitário"));
        produto[indexProduto] = new Produto(nomeProduto, quantEst, valorUni, fornecedor);
        indexProduto++;

    }

    private Fornecedor cadastrarFornecedor() {
    long cnpj = parseLong(showInputDialog("CNJP do Fornecedor"));
    String nome = showInputDialog("Nome do Fornecedor");
    fornecedor[indexFornecedor] = new Fornecedor(nome,cnpj);
    indexFornecedor++;
    return fornecedor[indexFornecedor-1];

    }



}
