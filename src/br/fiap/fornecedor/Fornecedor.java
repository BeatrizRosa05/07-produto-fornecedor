package br.fiap.fornecedor;

public class Fornecedor {

    private String nome;
    private long cnpj;

    //ATALHO
    // alt + inset

    public Fornecedor(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //MÉTODO DE ACESSO - GET
    //Sempre retorna - NÃO recebe parametro
    public String getNome(){
        return nome;
    }

    //MÉTODO DE ACESSO - SET
    //void - this
        public void setNome(String nome){
            this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}////////////////////////////////////////
