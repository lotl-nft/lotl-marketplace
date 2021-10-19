package lords.land.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@MongoEntity(collection="lands")
public class Land {
    Integer id;

    String title;

    Integer attributes;

    Integer size;

    Integer status;

    Timestamp createdAt;

    Timestamp updatedAt;
}
