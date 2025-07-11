package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

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

    public static EscolasDeMagiaEnum porValor(int valor) {
        return Stream.of(EscolasDeMagiaEnum.values())
                .filter(t -> t.getValor() == valor)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor Enum invalido: " + valor));
    }

    public static EscolasDeMagiaEnum porDescricao(String descricao) {
        return Stream.of(EscolasDeMagiaEnum.values())
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Descrição Enum invalido: " + descricao));
    }
}
