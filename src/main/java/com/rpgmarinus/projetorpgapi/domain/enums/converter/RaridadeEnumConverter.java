package com.rpgmarinus.projetorpgapi.domain.enums.converter;

import com.rpgmarinus.projetorpgapi.domain.enums.RacaEnum;
import com.rpgmarinus.projetorpgapi.domain.enums.RaridadeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter
public class RaridadeEnumConverter implements AttributeConverter<RaridadeEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(RaridadeEnum value) {
        return Objects.isNull(value) ? null : value.getValor();
    }

    @Override
    public RaridadeEnum convertToEntityAttribute(Integer integer) {
        return Objects.isNull(integer) ? null : RaridadeEnum.porValor(integer);
    }

}
