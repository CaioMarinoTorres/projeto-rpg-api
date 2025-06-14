package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

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

    public static RacaEnum porValor(int valor) {
        return Stream.of(RacaEnum.values())
                .filter(t -> t.getValor() == valor)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor Enum invalido: " + valor));
    }

    public static RacaEnum porDescricao(String descricao) {
        return Stream.of(RacaEnum.values())
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Descrição Enum invalido: " + descricao));
    }
}
