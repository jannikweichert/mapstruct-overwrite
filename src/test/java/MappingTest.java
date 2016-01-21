import de.jannikweichert.Foo;
import de.jannikweichert.FooDTO;
import de.jannikweichert.FooMapper;
import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Jannik on 21.01.16.
 */
public class MappingTest {

    @Test
    public void testAppendCollectionOnUpdate(){
        Foo foo = new Foo();
        foo.setElements(new HashSet<String>(Arrays.asList("one", "two", "three")));

        FooDTO fooDTO = new FooDTO();
        fooDTO.setElements(new HashSet<String>(Arrays.asList("four", "five", "six")));

        Foo updated = Mappers.getMapper(FooMapper.class).updateFooFromDTO(foo, fooDTO);

        Assert.assertEquals(updated.getElements().size(), 6);
    }
}
