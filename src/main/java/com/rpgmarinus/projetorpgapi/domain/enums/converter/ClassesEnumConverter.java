package com.rpgmarinus.projetorpgapi.domain.enums.converter;

import com.rpgmarinus.projetorpgapi.domain.enums.ClassesEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter
public class ClassesEnumConverter implements AttributeConverter<ClassesEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ClassesEnum value) {
        return Objects.isNull(value) ? null : value.getValor();
    }

    @Override
    public ClassesEnum convertToEntityAttribute(Integer integer) {
        return Objects.isNull(integer) ? null : ClassesEnum.porValor(integer);
    }

}
