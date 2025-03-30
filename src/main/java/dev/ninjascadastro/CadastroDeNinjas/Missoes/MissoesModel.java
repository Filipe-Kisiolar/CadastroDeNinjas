package dev.ninjascadastro.CadastroDeNinjas.Missoes;

import dev.ninjascadastro.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_de_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDaMissao;
    private char nivelMissao;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nomeDaMissao, char nivelMissao) {
        this.nomeDaMissao = nomeDaMissao;
        this.nivelMissao = nivelMissao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public char getNivelMissao() {
        return nivelMissao;
    }

    public void setNivelMissao(char nivelMissao) {
        this.nivelMissao = nivelMissao;
    }
}
