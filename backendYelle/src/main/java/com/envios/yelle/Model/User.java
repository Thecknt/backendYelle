package com.envios.yelle.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="datosUsuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUSer;

    @NotNull
    private String name;

    @NotNull
    private String lastname;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String location;

    @NotNull
    private String province;

    @NotNull
    private String password;
}
