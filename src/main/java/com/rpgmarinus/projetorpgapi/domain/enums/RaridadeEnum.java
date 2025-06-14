package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum RaridadeEnum {

    COMUM      (1, "Comum"      ),
    INCOMUM    (2, "Incomum"    ),
    RARO       (3, "Raro"       ),
    SUPER_RARO (4, "Super Raro" ),
    LENDARIO   (5, "Lendário"   );

    private final Integer valor;
    private final String descricao;

    public static RaridadeEnum porValor(int valor) {
        return Stream.of(RaridadeEnum.values())
                .filter(t -> t.getValor() == valor)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor Enum invalido: " + valor));
    }

    public static RaridadeEnum porDescricao(String descricao) {
        return Stream.of(RaridadeEnum.values())
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Descrição Enum invalido: " + descricao));
    }
}
