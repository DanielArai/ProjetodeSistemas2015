package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public abstract class Dao {

    /**
     * Método abstrado, ou seja é definido para que obrigatoriamente todas as subclasses de dao tenham uma implementação concreta para este método.
     *
     * @param entidade
     * @return
     */
    protected abstract Boolean valida(IBean entidade);


    /**
     * Método que será reutilizado em todas as subclasses
     *
     * @param entidade
     */
    public void salvar(IBean entidade) {

        /**
         * utilização do método valida, que tem implementação específica em cada subclasse criada.
         */
        if (valida(entidade) == true) {
            System.out.println("registro salvo com sucesso");
        } else {
            System.out.println(" dados invalidos");
        }

    }


}
