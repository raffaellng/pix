package com.pix.chavepix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChavePixDTO {

    @ToString.Exclude
    private String nomeCLiente;
    private String chavePixCliente;
    private String tipoChave;
    private String banco;
    private int agencia;
    private int conta;
    private String motivoAlteracao;

}
