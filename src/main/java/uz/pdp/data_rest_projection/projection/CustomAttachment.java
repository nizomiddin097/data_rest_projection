package uz.pdp.data_rest_projection.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_projection.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

    String getName();

    Long getSize();

    String getContentType();
}
