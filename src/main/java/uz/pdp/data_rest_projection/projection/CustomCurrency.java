package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();
}
