package debug.mapstruct.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TestMapper {
	@Mapping(source = "a", target = "b")
	public PojoB convert(PojoA pojo);
}
