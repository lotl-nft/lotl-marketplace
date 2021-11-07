package lords.land.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.sql.Timestamp;

@Getter
@Setter
@MongoEntity(collection="lands")
public class LandEntity {
    ObjectId id;

    String title;

    Integer attribute;

    String address;

    Integer status;

    String ownerAddress;

    Timestamp createdAt;

    Timestamp updatedAt;
}
