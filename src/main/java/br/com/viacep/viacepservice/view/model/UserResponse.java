package br.com.viacep.viacepservice.view.model;

import java.math.BigDecimal;
import java.util.HashMap;

public class UserResponse {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private BigDecimal valorFrete;

    HashMap<String, BigDecimal> fretePorCidade = new HashMap<String, BigDecimal>() {
        {
            put("Teresópolis", new BigDecimal("25.0"));
            put("Nova Friburgo", new BigDecimal("15.0"));
            put("Petrópolis", new BigDecimal("20.0"));
            put("Rio de Janeiro", new BigDecimal("30.0"));
        }
    };

    public UserResponse(String cep, String logradouro, String bairro, String localidade, String uf,
            BigDecimal valorFrete) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        setValorFrete(valorFrete, localidade);
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete, String localidade) {
        if (localidade == null) {
            this.valorFrete = null;
        } else if (fretePorCidade.containsKey(localidade)) {
            this.valorFrete = fretePorCidade.get(localidade);
        } else {
            this.valorFrete = new BigDecimal("50.0");
        }
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }
}
