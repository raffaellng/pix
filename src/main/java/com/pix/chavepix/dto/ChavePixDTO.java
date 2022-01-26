package com.pix.chavepix.dto;

import com.pix.chavepix.validation.NotEmptyClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChavePixDTO {

    @ToString.Exclude
    @NotEmptyClass(message = "Campo nao pode ser Vazio")
    private String nomeCLiente;

    @NotEmptyClass(message = "Campo nao pode ser Vazio")
    private String chavePixCliente;

    @NotEmptyClass(message = "Campo nao pode ser Vazio")
    private String tipoChave;

    private String banco;
    private int agencia;
    private int conta;
    private String motivoAlteracao;

}
