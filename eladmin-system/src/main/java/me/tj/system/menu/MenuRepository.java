package me.tj.system.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 菜单仓库
 */
public interface MenuRepository extends JpaRepository<Menu,Integer>, JpaSpecificationExecutor<Menu> {
}
