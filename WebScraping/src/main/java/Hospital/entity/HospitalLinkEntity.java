package Hospital.entity;

import baseStructures.BaseLinkEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hospital_links")
public class HospitalLinkEntity extends BaseLinkEntity {
}
