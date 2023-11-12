package org.locadora.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_notas_fiscais")

public class NotaFiscal {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private BigDecimal valor;

    @Column(name = "sub_total")
    private BigDecimal subTotal;
    private BigDecimal imposto;
    @Column(name = "data_emissao")
    private BigDecimal dataemissao;
    private BigDecimal total;

    @OneToOne
    @JoinColumn(name = "id_locacao")
    private Locacao locacao;

 //calculo para imposto

//    public BigDecimal subtotal(){
//        double calcNF = getValor() * getDiaria();
//        return calcNF;
//    }
//    public BigDecimal subtotal(double subtotal){
//        setSubTotal(subTotal);
//        return getSubTotal();
//    }
//
//    public BigDecimal calcImp(){
//        double imp = getValor() * getImposto();
//        return imp;
//    }
//    public BigDecimal totalNota(double totalNota){
//        double nf =
//    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + id +
                ", valor=" + valor +
                ", imposto=" + imposto +
                ", dataemissao=" + dataemissao +
                ", total=" + total +
                ", locacao=" + locacao +
                '}';
    }
}
