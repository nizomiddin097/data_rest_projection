package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Measurement;
import uz.pdp.data_rest_projection.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)

public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);

    @RestResource(path = "byName")
    public Page<Measurement> findAllByName(@Param("name") String name, Pageable pageable);


}
