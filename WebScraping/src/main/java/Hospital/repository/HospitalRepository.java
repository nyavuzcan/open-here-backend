package Hospital.repository;

import Hospital.entity.HospitalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends MongoRepository<HospitalEntity,String> {
}
