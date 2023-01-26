package euzebio.george.labdesignpatternsspring.service;

import euzebio.george.labdesignpatternsspring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Client HTTP criado com <b>OpenFeign</b> para consumir
 * a API do ViaCEP.
 *
 * @see <a href = "https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href = "https://viacep.com.br">viaCEP</a>
 *
 * @author georgeeuzebio
 * */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
