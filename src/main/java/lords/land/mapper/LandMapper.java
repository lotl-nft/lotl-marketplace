package lords.land.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import lords.land.model.Land;
import lords.land.model.LandEntity;
import lords.land.e.LandAttribute;
import lords.land.e.LandStatus;

@Mapper( imports = { LandAttribute.class, LandStatus.class } )
public interface LandMapper {
	LandMapper INSTANCE = Mappers.getMapper( LandMapper.class );

	@Mapping(target = "attribute",
         expression = "java( LandAttribute.get(landEntity.getAttribute()).name() )")
	@Mapping(target = "status",
         expression = "java( LandStatus.get(landEntity.getStatus()).name() )")
	Land landEntityToLand( LandEntity landEntity );

}
