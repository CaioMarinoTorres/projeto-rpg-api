package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClassesEnum {

    ARTIFICIE   (1,  "Artíficia"   ),
    BARBARO     (2,  "Bárbaro"     ),
    BARDO       (3,  "Bardo"       ),
    BRUXO       (4,  "Bruxo"       ),
    CLERIGO     (5,  "Clérigo"     ),
    DRUIDA      (6,  "Druida"      ),
    FEITICEIRO  (7,  "Feiticeiro"  ),
    PATRULHEIRO (8,  "Patrulheiro" ),
    GUERREIRO   (9,  "Guerreiro"   ),
    LADINO      (10, "Ladino"      ),
    MAGO        (11, "Mago"        ),
    MONGE       (12, "Monge"       ),
    PALADINO    (13, "Paladino"    );

    private final Integer valor;
    private final String descricao;
}
