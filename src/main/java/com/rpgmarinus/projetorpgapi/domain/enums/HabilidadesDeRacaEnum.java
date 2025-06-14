package com.rpgmarinus.projetorpgapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum HabilidadesDeRacaEnum {

    VISAO_NO_ESCURO                    (1,  "Visão no e scuro"                  ),

    RESILIENCIA_ANA                    (2,  "Resiliência anã"                   ),
    TENACIDADE_ANA                     (3,  "Tenacidade anã"                    ),
    TREINAMENTO_ANAO_EM_COMBATE        (4,  "Treinamento anão em combate"       ),
    TREINAMENTO_ANAO_COM_ARMADURAS     (5,  "Treinamento anão com armaduras"    ),

    SENTIDOS_AGUCADO_ELFICO            (6,  "Sentidos aguçado élfico"           ),
    ANCESTRAL_FEERICO_ELFICO           (7,  "Ancestral feérico élfico"          ),
    TRANSE_ELFICO_ELFICO               (8,  "Transe élfico"                     ),
    TREINAMENTO_ELFICO_COM_ARMAS       (9,  "Treinamento élfico com armas"      ),
    TRUQUE                             (10, "Truque"                            ),
    SENSIBILIDADE_A_LUZ_SOLAR          (11, "Sensibilidade a Luz Solar"         ),
    MAGIA_DROW                         (12, "Magia drow"                        ),
    TREINAMENTO_DROW_COM_ARMAS         (13, "Treinamento drow com armas"        ),

    SORTUDO                            (14, "Sortudo"                           ),
    BRAVURA                            (15, "Bravura"                           ),
    AGILIDADE_HALFLING                 (16, "Agilidade halfling"                ),
    FURTIVIDADE_NATURAL                (17, "Furtividade natural"               ),
    RESILIENCIA_DOS_ROBUSTOS           (18, "Resiliência dos robustos"          ),

    ANCESTRAL_DRACONICO                (19, "Ancestral dracônico"               ),
    ARMA_DE_SOPRO                      (20, "Arma de sopro"                     ),
    RESISTENCIA_A_DANO                 (21, "Resistencia a dano"                ),

    ESPERTEZA_GNOMICA                  (22, "Esperteza gnômica"                 ),
    FALAR_COM_BESTAS_PEQUENAS          (23, "Falar com bestas pequenas"         ),
    CONHECIMENTO_DE_ARTIFICIE          (24, "Conhecimento de artíficie"         ),
    ENGENHOQUEIRO                      (25, "Engenhoqueiro"                     ),

    ANCESTRAL_FEERICO_MEIO_ELFO        (26, "Ancestral feérico meio-elfo"       ),
    VERSATILIDADE_EM_PERICIA_MEIO_ELFO (27, "Versatilidade em pericia meio-elfo"),

    AMEACADOR                          (28, "Ameaçador"                         ),
    RESISTENCIA_IMPLACAVEL             (29, "Resistencia implacavel"            ),
    ATAQUES_SELVAGENS                  (30, "Ataques selvagens"                 ),

    RESISTENCIA_INFERNAL               (31, "Resistencia infernal"              ),
    LEGADO_INFERNAL                    (32, "Legado infernal"                   );

    private final Integer valor;
    private final String descricao;

    public static HabilidadesDeRacaEnum porValor(int valor) {
        return Stream.of(HabilidadesDeRacaEnum.values())
                .filter(t -> t.getValor() == valor)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Valor Enum invalido: " + valor));
    }

    public static HabilidadesDeRacaEnum porDescricao(String descricao) {
        return Stream.of(HabilidadesDeRacaEnum.values())
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Descrição Enum invalido: " + descricao));
    }
}
