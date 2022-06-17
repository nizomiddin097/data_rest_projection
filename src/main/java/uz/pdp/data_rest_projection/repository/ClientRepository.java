package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.Client;
import uz.pdp.data_rest_projection.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)

public interface  ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByNameAndPhoneNumber(String name,String phoneNumber);

    @RestResource(path = "byName")
    public Page<Client> findAllByName(@Param("name") String name, Pageable pageable);


}
