package com.rpgmarinus.projetorpgapi.domain.entities;

import com.rpgmarinus.projetorpgapi.domain.enums.RacaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Raca {

    @Id
    Long id;
    RacaEnum raca;
}
