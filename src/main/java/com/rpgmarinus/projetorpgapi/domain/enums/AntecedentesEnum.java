package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AntecedentesEnum {

    ACOLITO             (1,  "Acólito"           ),
    ARTESAO_DE_GUILDA   (2,  "Artesão de Guilda" ),
    ARTISTA             (3,  "Artista"           ),
    CHARLATAO           (4,  "Charlatão"         ),
    CRIMINOSO           (5,  "Criminoso"         ),
    EREMITA             (6,  "Eremita"           ),
    FORASTEIRO          (7,  "Forateiro"         ),
    HEROI               (8,  "Herói"             ),
    NOBRE               (9,  "Nobre"             ),
    ORFAO               (10, "Orfão"             ),
    SABIO               (11, "Sábio"             ),
    SOLDADO             (12, "Soldado"           );

    private final Integer valor;
    private final String descricao;
}
