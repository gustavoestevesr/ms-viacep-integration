package br.com.viacep.viacepservice.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {

    @NotEmpty(message = "Mão pode estar vazio")
    @NotBlank(message = "Não pode conter caracteres brancos")
    @Size(min = 8, max = 8, message = "Deve conter apenas 8 digítos")
    private String cep;    
     
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    
}

