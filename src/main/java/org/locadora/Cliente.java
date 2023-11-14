package org.locadora;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.locadora.enums.TipoCliente;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_clientes")
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoCliente tipocliente;

    @ManyToOne
    @JoinColumn(name = "id_cliente_pf")
    private ClientePF clientePF;

    @ManyToOne
    @JoinColumn(name = "id_cliente_cnpj")
    private ClienteCNPJ clienteCNPJ;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", tipocliente=" + tipocliente +
                ", clientePF=" + clientePF +
                ", clienteCNPJ=" + clienteCNPJ +
                '}';
    }
}
