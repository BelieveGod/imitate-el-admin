package me.tj.system.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * θεδ»εΊ
 */
public interface MenuRepository extends JpaRepository<Menu,Integer>, JpaSpecificationExecutor<Menu> {
}
