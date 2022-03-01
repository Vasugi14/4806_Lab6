package vasugiaddressbook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "buddy", path="buddy")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findByName(String name);
}
