package Hospital.repository;

import Hospital.entity.HospitalLinkEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalLinkRepository extends MongoRepository<HospitalLinkEntity,String> {
}
