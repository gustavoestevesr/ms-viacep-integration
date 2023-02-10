package br.com.viacep.viacepservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.viacep.viacepservice.view.model.UserResponse;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCepFeign {
    
    @GetMapping("{cep}/json")
    UserResponse buscaEnderecoCep(@PathVariable("cep") String cep);
    
}
