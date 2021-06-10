package me.tj.system.menu;

import lombok.Data;
import me.tj.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/10 17:28
 */
@Data
@Entity
@Table(name="menu_tb")
public class Menu extends BaseEntity {

    @Column(name="parent_id")
    private Integer parentId;

    @Column(name="title")
    private String title;

    @Column(name="path")
    private String path;

    @Column(name="has_Child")
    private Boolean hasChild;


}
