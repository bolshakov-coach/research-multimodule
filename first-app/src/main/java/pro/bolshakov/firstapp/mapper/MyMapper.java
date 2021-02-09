package pro.bolshakov.firstapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pro.bolshakov.firstapp.model.EntityFrom;
import pro.bolshakov.firstapp.model.EntityTo;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MyMapper extends MyMapperBase<EntityTo> {

    @Override
    @Mapping(target = "id", expression = "java(444)")
    @Mapping(target = "fieldTo", source = "fieldFrom")
    EntityTo fromNew(EntityFrom entity);
}
