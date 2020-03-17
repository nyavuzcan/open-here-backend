package Hospital.repository;

import Hospital.entity.HealthClinicLinkEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthClinicLinkRepository extends MongoRepository<HealthClinicLinkEntity, String> {
}
