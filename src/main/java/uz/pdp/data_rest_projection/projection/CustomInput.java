package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.Currency;
import uz.pdp.data_rest_projection.entity.Input;
import uz.pdp.data_rest_projection.entity.Supplier;
import uz.pdp.data_rest_projection.entity.Warehouse;

import javax.persistence.Column;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    //Warehouse getWarehouse();

    //Supplier getSupplier();

    //Currency getCurrency();

    String getFactureNumber();

    String getCode();

}
