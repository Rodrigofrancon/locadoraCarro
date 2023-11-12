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
@Table(name = "tb_locacoes")
public class Locacao {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_saida")
    private LocalDateTime datasaida;
    @Column(name = "data_entrada")
    private LocalDateTime entrada;
    private Integer diaria;
    @Column(name = "km_inicial")
    private BigDecimal kminicial;
    @Column(name = "km_final")
    private BigDecimal kmfinal;

    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne(mappedBy = "locacao")
    private NotaFiscal notaFiscal;


    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", datasaida=" + datasaida +
                ", entrada=" + entrada +
                ", diaria=" + diaria +
                ", kminicial=" + kminicial +
                ", kmfinal=" + kmfinal +
                ", veiculo=" + veiculo +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", notaFiscal=" + notaFiscal +
                '}';
    }
}

