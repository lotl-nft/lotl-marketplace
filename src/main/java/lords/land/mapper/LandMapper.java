package lords.land.mapper;

import lords.land.enumrable.LandAttribute;
import lords.land.enumrable.LandStatus;
import lords.land.model.Land;
import lords.land.model.LandEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper( imports = { LandAttribute.class, LandStatus.class } )
public interface LandMapper {
	LandMapper INSTANCE = Mappers.getMapper( LandMapper.class );

	@Mapping(target = "attribute",
         expression = "java( LandAttribute.get(landEntity.getAttribute()).name() )")
	@Mapping(target = "status",
         expression = "java( LandStatus.get(landEntity.getStatus()).name() )")
	Land landEntityToLand( LandEntity landEntity );

}
