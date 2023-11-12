package org.locadora.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.locadora.entities.enums.Sexo;

import java.time.LocalDateTime;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_clientes_pfs")

public class ClientePF {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private String cnh;
    @Column(name = "data_nascimento")
    private LocalDateTime datanascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String naturalidade;
    @Column(name = "nome_mae")
    private String nomemae;
    @Column(name = "nome_pai")
    private String nomepai;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_contato")
    private Contato contato;

    @Override
    public String toString() {
        return "ClientePF{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", cnh='" + cnh + '\'' +
                ", datanascimento=" + datanascimento +
                ", sexo=" + sexo +
                ", naturalidade='" + naturalidade + '\'' +
                ", nomemae='" + nomemae + '\'' +
                ", nomepai='" + nomepai + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
