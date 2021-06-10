package me.tj.system.menu;

import lombok.Data;

import java.util.List;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/10 17:36
 */
@Data
public class MenuVO {
    private Integer id;
    private String title;
    private String path;
    private Boolean hasChild;
    private List<MenuVO> child;
}
