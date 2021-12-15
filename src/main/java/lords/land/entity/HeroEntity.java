package lords.land.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.sql.Timestamp;

@Getter
@Setter
@MongoEntity(collection="heroes")
public class HeroEntity {
    ObjectId id;

    String title;

    Integer attribute;

    String address;

    Integer status;

    String ownerAddress;

    Timestamp createdAt;

    Timestamp updatedAt;
}
