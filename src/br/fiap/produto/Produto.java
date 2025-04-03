package br.fiap.produto;

import br.fiap.fornecedor.Fornecedor;

public class Produto {

        //Atributos
        private String nomeProduto;
        private int quantEst;
        private double valorUni;
        //Como o fornecedor é público é só colocar como atributo
        private Fornecedor fornecedor;

        //GERA O CONSTRUDOR COM O ATALHO
    public Produto(String nomeProduto, int quantEst, double valorUni, Fornecedor fornecedor) {
        this.nomeProduto = nomeProduto;
        this.valorUni = valorUni;
        this.quantEst = quantEst;
        this.fornecedor = fornecedor;
    }

    //GET E SET FEITO COM ATALHO
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public int getQuantEst() {
        return quantEst;
    }

    public void setQuantEst(int quantEst) {
        this.quantEst = quantEst;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}/////////////////////////
