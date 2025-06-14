package com.rpgmarinus.projetorpgapi.domain.enums.converter;

import com.rpgmarinus.projetorpgapi.domain.enums.EscolasDeMagiaEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter
public class EscolasDeMagiaEnumConverter implements AttributeConverter<EscolasDeMagiaEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EscolasDeMagiaEnum value) {
        return Objects.isNull(value) ? null : value.getValor();
    }

    @Override
    public EscolasDeMagiaEnum convertToEntityAttribute(Integer integer) {
        return Objects.isNull(integer) ? null : EscolasDeMagiaEnum.porValor(integer);
    }

}
