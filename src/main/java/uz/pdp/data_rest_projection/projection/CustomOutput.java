package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.Client;
import uz.pdp.data_rest_projection.entity.Currency;
import uz.pdp.data_rest_projection.entity.Output;
import uz.pdp.data_rest_projection.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    //Timestamp getDate();

    //Warehouse getWarehouse();

    //Client getClient();

    //Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
