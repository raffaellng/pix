package com.pix.chavepix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChavePixDTO {

    @NotEmpty(message = "Nome do cliente nao pode ser null")
    private String nomeCLiente;

    @NotEmpty(message = "A chave nao pode ser null")
    private String chavePixCliente;

    private String tipoChave;

    @NotBlank(message = "Conta nao pode ser null")
    private String banco;

    @NotBlank(message = "Conta nao pode ser null")
    private int agencia;

    @NotBlank(message = "Conta nao pode ser null")
    private int conta;

    private String motivoAlteracao;

}
