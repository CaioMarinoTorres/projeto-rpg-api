package com.rpgmarinus.projetorpgapi.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = Personagem.TABLE_NAME)
public class Personagem {

    public static final String TABLE_NAME = "tb_personagem";
    public static final String SEQ_NAME = "tb_personagem_seq";

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @Column(name = "id_personagem", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "nivel", nullable = false)
    private Integer nivel;

    @OneToOne
    @JoinColumn(name = "id_raca", nullable = false)
    private Raca raca;

    @OneToOne
    @JoinColumn(name = "id_iventario", nullable = false)
    private Inventario iventario;

    @OneToMany
    @JoinColumn(name = "id_classe", nullable = false)
    private List<Classe> classe;

    @OneToMany
    @JoinColumn(name = "id_magia", nullable = false)
    private List<Magia> magia;

}
