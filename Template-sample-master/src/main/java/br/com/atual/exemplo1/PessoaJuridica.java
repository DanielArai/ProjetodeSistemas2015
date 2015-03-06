package br.com.atual.exemplo1;


public class PessoaJuridica extends Entidade implements IBean {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
   
    
}
