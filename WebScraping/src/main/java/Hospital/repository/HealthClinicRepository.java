package Hospital.repository;

import Hospital.entity.HealthClinicEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthClinicRepository extends MongoRepository<HealthClinicEntity,String> {
}
