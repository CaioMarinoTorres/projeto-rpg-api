package com.rpgmarinus.projetorpgapi.domain.enums.converter;

import com.rpgmarinus.projetorpgapi.domain.enums.RacaEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter
public class RacaEnumConverter implements AttributeConverter<RacaEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(RacaEnum value) {
        return Objects.isNull(value) ? null : value.getValor();
    }

    @Override
    public RacaEnum convertToEntityAttribute(Integer integer) {
        return Objects.isNull(integer) ? null : RacaEnum.porValor(integer);
    }

}

