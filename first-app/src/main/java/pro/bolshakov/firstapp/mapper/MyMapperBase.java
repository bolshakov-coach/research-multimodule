package pro.bolshakov.firstapp.mapper;

import org.mapstruct.Mapping;
import pro.bolshakov.firstapp.model.EntityFrom;
import pro.bolshakov.firstapp.model.EntityToBase;

public interface MyMapperBase<T extends EntityToBase> {

    @Mapping(target = "fieldTo", source = "fieldFrom")
    T from(EntityFrom entity);

    @Mapping(target = "fieldTo", source = "fieldFrom")
    T fromNew(EntityFrom entity);

}
