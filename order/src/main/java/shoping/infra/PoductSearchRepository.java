package shoping.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoping.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "poductSearches",
    path = "poductSearches"
)
public interface PoductSearchRepository
    extends PagingAndSortingRepository<PoductSearch, Long> {}
