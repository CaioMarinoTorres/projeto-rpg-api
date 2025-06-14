package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum TipoDeItemEnum {

    ARMADURA                    (1,  "Armadura"                   ),
    ARMA_MARCIAL_CORPO_A_CORPO  (2,  "Arma marcial corpo-a-corpo" ),
    ARMA_MARCIAL_A_DISTANCIA    (3,  "Arma marcial a distancia"   ),
    ARMA_SIMPLES_CORPO_A_CORPO  (4,  "Arma simples corpo-a-corpo" ),
    ARMA_SIMPLES_A_DISTANCIA    (5,  "Arma simples a distancia"   ),
    COMIDA                      (6,  "Comida"                     ),
    BEBIDA                      (7,  "Bebida"                     ),
    MAGICO                      (8,  "Magico"                     ),
    FERRAMENTA                  (9,  "Ferramenta"                 ),
    EQUIPAMENTO                 (10, "Equipamento"                );

    private final Integer valor;
    private final String descricao;

    public static TipoDeItemEnum porValor(int valor) {
        return Stream.of(TipoDeItemEnum.values())
                .filter(t -> t.getValor() == valor)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor Enum invalido: " + valor));
    }

    public static TipoDeItemEnum porDescricao(String descricao) {
        return Stream.of(TipoDeItemEnum.values())
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Descrição Enum invalido: " + descricao));
    }

}
