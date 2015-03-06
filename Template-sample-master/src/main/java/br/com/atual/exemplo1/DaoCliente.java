package br.com.atual.exemplo1;

/**
 * Created by ton on 04/03/15.
 */
public class DaoCliente extends Dao {
    @Override
    protected Boolean valida(IBean entidade) {

        Cliente cli = (Cliente) entidade;

        if (cli.getNumeroCliente() != null) {
            return true;
        }

        return false;
    }
}
