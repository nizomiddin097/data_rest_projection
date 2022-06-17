package uz.pdp.data_rest_projection.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.data_rest_projection.entity.templete.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Supplier extends AbsEntity {

    @Column(unique = true,nullable = false)
    private String phoneNumber;


}
