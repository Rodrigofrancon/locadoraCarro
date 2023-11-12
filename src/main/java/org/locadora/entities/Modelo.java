package org.locadora.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_modelos")

public class Modelo {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
