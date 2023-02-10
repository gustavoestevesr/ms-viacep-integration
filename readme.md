# ViaCep Service Integration

## ViaCep
Webservice gratuito e de alto desempenho para consultar Códigos de Endereçamento Postal (CEP) do Brasil.

## Objetivo
Consumir um serviço externo de consulta de CEP para calcular o valor de frete de produtos através do atributo "localidade" ou cidade.

## Acessando o webservice CEP
Acessando o webservice de CEP
Para acessar o webservice, um CEP no formato de {8} dígitos deve ser fornecido, por exemplo: "01001000".
Após o CEP, deve ser fornecido o tipo de retorno desejado, que deve ser "json", "xml", "piped" ou "querty".

Exemplo de pesquisa por CEP:
viacep.com.br/ws/01001000/json/

## Validação do CEP

Quando consultado um CEP de formato inválido, por exemplo: "950100100" (9 dígitos), "95010A10" (alfanumérico), "95010 10" (espaço), o código de retorno da consulta será um 400 (Bad Request). Antes de acessar o webservice, valide o formato do CEP e certifique-se que o mesmo possua {8} dígitos. Exemplo de como validar o formato do CEP em javascript está disponível nos exemplos abaixo.

Quando consultado um CEP de formato válido, porém inexistente, por exemplo: "99999999", o retorno conterá um valor de "erro" igual a "true". Isso significa que o CEP consultado não foi encontrado na base de dados. Veja como manipular este "erro" em javascript nos exemplos abaixo.

## Formatos de Retorno:
Veja exemplos de acesso ao webservice e os diferentes tipos de retorno:

URL: viacep.com.br/ws/01001000/json/

    {
      "cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
      "ibge": "3550308",
      "gia": "1004",
      "ddd": "11",
      "siafi": "7107"
    }

## Fonte:
- https://viacep.com.br/