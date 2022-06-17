package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Currency;
import uz.pdp.data_rest_projection.projection.CustomCurrency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)

public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);

    @RestResource(path = "byName")
    public Page<Currency> findAllByName(@Param("name") String name, Pageable pageable);



}
