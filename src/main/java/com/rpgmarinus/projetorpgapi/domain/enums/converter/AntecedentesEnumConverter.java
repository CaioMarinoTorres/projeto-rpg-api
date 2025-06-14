package com.rpgmarinus.projetorpgapi.domain.enums.converter;

import com.rpgmarinus.projetorpgapi.domain.enums.AntecedentesEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter
public class AntecedentesEnumConverter implements AttributeConverter<AntecedentesEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AntecedentesEnum value) {
        return Objects.isNull(value) ? null : value.getValor();
    }

    @Override
    public AntecedentesEnum convertToEntityAttribute(Integer integer) {
        return Objects.isNull(integer) ? null : AntecedentesEnum.porValor(integer);
    }

}
