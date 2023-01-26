package euzebio.george.labdesignpatternsspring.service;

import euzebio.george.labdesignpatternsspring.model.Cliente;
/**
 * Interface que define o <b>Strategy</b> no domínio
 * do cliente.
 * */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
