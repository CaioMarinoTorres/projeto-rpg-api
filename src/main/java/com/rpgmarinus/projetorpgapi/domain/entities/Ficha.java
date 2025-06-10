package com.rpgmarinus.projetorpgapi.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ficha {


    @Id
    private Long id;

    @OneToOne
    private Personagem personagem;

}
