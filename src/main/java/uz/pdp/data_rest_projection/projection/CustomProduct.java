package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.Attachment;
import uz.pdp.data_rest_projection.entity.Category;
import uz.pdp.data_rest_projection.entity.Measurement;
import uz.pdp.data_rest_projection.entity.Product;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String name();

    //Category getCategory();

    //Attachment getPhoto();

    String getCode();

    //Measurement getMeasurement();
}
