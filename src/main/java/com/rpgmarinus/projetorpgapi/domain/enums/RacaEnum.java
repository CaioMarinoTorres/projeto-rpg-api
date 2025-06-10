package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RacaEnum {

    ANAO_DA_COLINA   (1, "Anão da Colina"   ),
    ANAO_DA_MONTANHA (2, "Anão da Montanha" ),
    ELFO             (3, "Elfo"             ),
    HALFLING         (4, "Halfling"         ),
    HUMAN            (5, "Humano"           ),
    DRACONATO        (6, "Dronato"          ),
    GNOMO            (7, "Gnomo"            ),
    MEIO_ELFO        (8, "Meio Elfo"        ),
    MEIO_ORC         (9, "Meio Orc"         ),
    TIEFLING         (10,"Tiefling"         );

    private final Integer valor;
    private final String descricao;
}
