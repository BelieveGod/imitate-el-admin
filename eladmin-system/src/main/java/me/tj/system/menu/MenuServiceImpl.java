package me.tj.system.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository menuRepository;
    // todo
    @Override
    public MenuVO getMenu() {
        List<Menu> all = menuRepository.findAll();
        // 一级目录
        List<MenuVO> menuVOList = new ArrayList<>();
        // 相同parentId 的group 的hashMap
        Map<Integer, List<Menu>> menuGroupMap = new HashMap<>();
        for (Menu menu : all) {
            // 0 代表没有父节点
            if(Objects.equals(menu.getParentId(),0)){
                MenuVO menuVO = new MenuVO();
                menuVO.setTitle(menu.getTitle());
                menuVO.setId(menu.getId());
                menuVO.setPath(menu.getPath());
                menuVOList.add(menuVO);
            }else{
                List<Menu> menus = menuGroupMap.get(menu.getParentId());
                if(menus==null){
                    menus = new LinkedList<>();
                    menuGroupMap.put(menu.getParentId(),menus);
                }
                menus.add(menu);
            }
        }
        for (MenuVO menuVO : menuVOList) {
            buildTree(menuVO,menuGroupMap);
        }
        MenuVO zeroMenu = new MenuVO();
        zeroMenu.setChild(menuVOList);
        return zeroMenu;
    }

    private void buildTree(MenuVO parentMenuVO, Map<Integer, List<Menu>> menuGroupMap){
        List<Menu> menus = menuGroupMap.get(parentMenuVO.getId());
        if(menus==null || menus.size()==0){
            return;
        }

        List<MenuVO> childList = new LinkedList<>();
        parentMenuVO.setChild(childList);
        for (Menu menu : menus) {
            MenuVO menuVO = new MenuVO();
            menuVO.setTitle(menu.getTitle());
            menuVO.setId(menu.getId());
            menuVO.setPath(menu.getPath());
            childList.add(menuVO);
        }
        // 递归构建子节点的菜单树
        for (MenuVO menuVO : childList) {
            buildTree(menuVO,menuGroupMap);
        }
    }
}

