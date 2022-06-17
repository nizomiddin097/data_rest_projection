package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Warehouse;
import uz.pdp.data_rest_projection.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWarehouse.class)

public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
//    boolean existsById( Integer warehous_id);
@RestResource(path = "byName")
public Page<Warehouse> findAllByName(@Param("name") String name, Pageable pageable);

}
