package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Output;
import uz.pdp.data_rest_projection.projection.CustomOutput;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)

public interface OutputRepository extends JpaRepository<Output,Integer> {

    @RestResource(path = "byName")
    public Page<Output> findAllByDAndDate(@Param("date") String date, Pageable pageable);






}
