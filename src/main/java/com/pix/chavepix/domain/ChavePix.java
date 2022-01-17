package com.pix.chavepix.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chavepix")
public class ChavePix implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome_cliente")
    private String nomeCLiente;

    @Column(name = "chave_pix")
    private String chavePixCliente;

    @Column(name = "tipo_chave")
    private String tipoChave;

    private boolean statusChave = true;

    @NotBlank(message = "banco nao pode ser null")
    private String banco;

    @NotBlank(message = "agencia nao pode ser null")
    private int agencia;

    @NotBlank(message = "conta nao pode ser null")
    private int conta;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @Column(name = "data_alteracao")
    private LocalDateTime dataAlteracao;

    @Column(name = "motivo_alteracao")
    private String motivoAlteracao;

    @PrePersist
    public void prePersist() {
        dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        dataAlteracao = LocalDateTime.now();
    }
}
