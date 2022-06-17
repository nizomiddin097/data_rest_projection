package uz.pdp.data_rest_projection.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.data_rest_projection.entity.AttachmentContent;
import uz.pdp.data_rest_projection.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContentRepository",collectionResourceRel = "list",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    @RestResource(path = "byName")
    public Page<AttachmentContent> findAllByName(@Param("name") String name, Pageable pageable);

}
