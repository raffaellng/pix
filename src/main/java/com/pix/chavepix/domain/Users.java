package com.pix.chavepix.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "{campo.login.obrigatorio}")
    @Column(name = "name")
    private String user;

    @NotEmpty(message = "{campo.senha.obrigatorio}")
    @Column(name = "password")
    private String passw;

    @Column
    private boolean active;
}
