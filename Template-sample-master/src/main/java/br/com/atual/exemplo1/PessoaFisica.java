package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public class PessoaFisica extends Entidade implements  IBean{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
