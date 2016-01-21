package de.jannikweichert;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * Created by Jannik on 21.01.16.
 */
@Mapper
public interface FooMapper {

    Foo updateFooFromDTO(@MappingTarget Foo foo, FooDTO fooDTO);
}
