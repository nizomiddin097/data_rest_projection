package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.User;
import uz.pdp.data_rest_projection.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {


    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();


    //Set<Warehouse> getWarehouses();
}
