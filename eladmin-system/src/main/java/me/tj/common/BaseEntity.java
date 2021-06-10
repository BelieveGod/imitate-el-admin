package me.tj.common;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/10 17:33
 */
@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String createdBy;
    private Date createdAt;
    private String updateBy;
    private Date updateAt;
    private Boolean deleted;
    private Integer version;
}
