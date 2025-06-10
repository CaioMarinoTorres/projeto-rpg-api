package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EscolasDeMagiaEnum {

    ABJURACAO    (0, "Abjuracao"    ),
    ADVINHACAO   (1, "Advinhação"   ),
    CONJURACAO   (2, "Conjuração"   ),
    ENCANTAMENTO (3, "Encantamento" ),
    EVOCACAO     (4, "Evocação"     ),
    ILUSAO       (5, "Ilusão"       ),
    NECROMANCIA  (6, "Necromancia"  ),
    TRANSMUTACAO (7, "Transmutação" );

    private final Integer valor;
    private final String descricao;
}
