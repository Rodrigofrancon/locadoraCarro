package org.locadora.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_veiculos")
public class Veiculo {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String renavan;
    private String placa;
    @Column(name = "ano_fabricacao")
    private String anofabricacao;
    private String chassi;
    private String cor;
    @Column(name = "modelo_fabricacao")
    private String modelofabricacao;
    @Column(name = "data_compra")
    private String datacompra;

    @ManyToOne
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @Override

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", anofabricacao='" + anofabricacao + '\'' +
                ", chassi='" + chassi + '\'' +
                ", cor='" + cor + '\'' +
                ", modelofabricacao='" + modelofabricacao + '\'' +
                ", datacompra='" + datacompra + '\'' +
                ", modelo=" + modelo +
                ", marca=" + marca +
                ", empresa=" + empresa +
                '}';
    }
}
