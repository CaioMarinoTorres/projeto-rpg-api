package com.rpgmarinus.projetorpgapi.domain.entities;

import com.rpgmarinus.projetorpgapi.domain.enums.ClassesEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Classe {

    @Id
    Long id;
    ClassesEnum classe;

}
