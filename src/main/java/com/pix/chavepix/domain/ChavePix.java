package com.pix.chavepix.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ChavePix")
public class ChavePix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomeCLiente;
    private String chavePix;
    private String tipoChave;
    private int banco;
    private int agencia;
    private int conta;
    private boolean statusChave;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
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
