package br.com.atual.exemplo1;

public class DaoPessoaJuridica extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {

        System.out.println(" executou em pessoa juridica");
        PessoaJuridica pj = (PessoaJuridica) entidade;

        if (pj.getId() != null && pj.getCnpj() != null) {
            return true;
        }

        return false;

    }
}
