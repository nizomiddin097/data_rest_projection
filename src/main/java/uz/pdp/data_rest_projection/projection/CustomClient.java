package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.AttachmentContent;
import uz.pdp.data_rest_projection.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();

    String getName();

    String getPhoneNumber();
}
