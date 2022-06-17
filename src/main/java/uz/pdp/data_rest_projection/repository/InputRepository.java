package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Input;
import uz.pdp.data_rest_projection.projection.CustomInput;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)

public interface InputRepository extends JpaRepository<Input,Integer> {

    @RestResource(path = "byName")
    public Page<Input> findAllBySupplier(@Param("supplier") String supplier, Pageable pageable);

}
