package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.User;
import uz.pdp.data_rest_projection.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByFirstNameAndLastNameAndPhoneNumberAndCode(String firstName,String lastName,String phoneNumber,String code);

    @RestResource(path = "byName")
    public Page<User> findAllByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);

}
