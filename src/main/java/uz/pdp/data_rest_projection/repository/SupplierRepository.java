package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Supplier;
import uz.pdp.data_rest_projection.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    @RestResource(path = "byName")
    public Page<Supplier> findAllByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);


}
