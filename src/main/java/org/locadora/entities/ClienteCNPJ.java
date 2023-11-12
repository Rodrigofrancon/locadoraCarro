package org.locadora.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_clientecnpj")
public class ClienteCNPJ {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String razaosocial;
    private String nomefantasia;
    private String inscricaomunicipal;
    private String inscricaoestadual;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_contato")
    private Contato contato;

    @Override
    public String toString() {
        return "ClienteCNPJ{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", razaosocial='" + razaosocial + '\'' +
                ", nomefantasia='" + nomefantasia + '\'' +
                ", inscricaomunicipal='" + inscricaomunicipal + '\'' +
                ", inscricaoestadual='" + inscricaoestadual + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
