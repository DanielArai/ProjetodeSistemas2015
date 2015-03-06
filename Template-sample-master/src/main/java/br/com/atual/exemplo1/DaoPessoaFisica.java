package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public class DaoPessoaFisica extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {

        System.out.println(" executou em pessoa fisica");

        PessoaFisica pf = (PessoaFisica) entidade;

        if (pf.getId() != null && pf.getCpf() != null) {
            return true;
        }

        return false;
    }
}
