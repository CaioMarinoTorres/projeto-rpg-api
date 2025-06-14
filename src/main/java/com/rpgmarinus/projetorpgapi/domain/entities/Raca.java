package com.rpgmarinus.projetorpgapi.domain.entities;

import com.rpgmarinus.projetorpgapi.domain.enums.HabilidadesDeRacaEnum;
import com.rpgmarinus.projetorpgapi.domain.enums.RacaEnum;
import com.rpgmarinus.projetorpgapi.domain.enums.converter.RacaEnumConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = Raca.TABLE_NAME)
public class Raca {

    public static final String TABLE_NAME = "tb_Raca";
    public static final String SEQ_NAME = "tb_raca_seq";

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;

    @Column(name = "nome", nullable = false)
    @Convert(converter = RacaEnumConverter.class)
    private RacaEnum nome;

    private Double deslocamento;

    private Double peso;

    private Double tamanho;

    private HabilidadesDeRacaEnum habilidadesDeRaca;

}