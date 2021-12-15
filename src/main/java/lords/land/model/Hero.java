package lords.land.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.sql.Timestamp;

@Getter
@Setter
public class Hero {
    ObjectId id;

    String title;

    String attribute;

    String address;

    String status;

    String ownerAddress;

    Timestamp createdAt;

    Timestamp updatedAt;
}
