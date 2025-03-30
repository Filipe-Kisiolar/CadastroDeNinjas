package dev.ninjascadastro.CadastroDeNinjas.Missoes;

import dev.ninjascadastro.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_de_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeDaMissao;

    private char nivelMissao;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;




}
