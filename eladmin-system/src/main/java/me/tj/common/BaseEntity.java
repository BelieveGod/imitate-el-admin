package me.tj.common;

import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "updateat")
    private Date updateAt;

    @Column(name = "is_deleted")
    private Boolean deleted;

    @Column(name = "version")
    private Integer version;
}
