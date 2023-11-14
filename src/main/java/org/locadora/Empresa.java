package org.locadora;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_empresas")
public class Empresa {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "razao_social")
    private String razaosocial;
    @Column(name = "nome_fantasia")
    private String nomefantasia;
    private String cnpj;
    private String telefone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", razaosocial='" + razaosocial + '\'' +
                ", nomefantasia='" + nomefantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
