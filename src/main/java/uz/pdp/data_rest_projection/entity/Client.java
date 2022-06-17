package uz.pdp.data_rest_projection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.data_rest_projection.entity.templete.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Client extends AbsEntity {

    @Column(unique = true,nullable = false)
    private String phoneNumber;

}
