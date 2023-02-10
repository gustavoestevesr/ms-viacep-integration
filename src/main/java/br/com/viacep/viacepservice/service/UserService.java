package br.com.viacep.viacepservice.service;

import org.springframework.stereotype.Service;

import br.com.viacep.viacepservice.feign.ViaCepFeign;
import br.com.viacep.viacepservice.view.model.UserRequest;
import br.com.viacep.viacepservice.view.model.UserResponse;

@Service
public class UserService {
    
    private final ViaCepFeign viaCepFeign;

    public UserService(ViaCepFeign viaCepFeign) {
        this.viaCepFeign = viaCepFeign;
    }

    public UserResponse executaRequestViaCep(UserRequest request) {
        return viaCepFeign.buscaEnderecoCep(request.getCep());
    }
}
