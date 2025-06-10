package com.rpgmarinus.projetorpgapi.domain.entities;

import com.rpgmarinus.projetorpgapi.domain.enums.EscolasDeMagiaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Magia {

    @Id
    Long id;
    String nome;
    String descricao;
    String duracao;
    String componentes;
    EscolasDeMagiaEnum escola;

}

