package com.rpgmarinus.projetorpgapi.domain.entities;

import com.rpgmarinus.projetorpgapi.domain.enums.RaridadeEnum;
import com.rpgmarinus.projetorpgapi.domain.enums.converter.RaridadeEnumConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = Item.TABLE_NAME)
public class Item {

    public static final String TABLE_NAME = "tb_item";
    public static final String SEQ_NAME = "tb_item_seq";

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @Column(name = "id_item", nullable = false)
    private Long id;

    @Column(name = "raridade")
    @Convert(converter = RaridadeEnumConverter.class)
    private RaridadeEnum raridade;

    private Integer peso;

    private Integer preco;

}
