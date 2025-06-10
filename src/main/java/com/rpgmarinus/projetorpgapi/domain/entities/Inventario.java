package com.rpgmarinus.projetorpgapi.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventario {

    @Id
    Long id;

    String itens;

}
