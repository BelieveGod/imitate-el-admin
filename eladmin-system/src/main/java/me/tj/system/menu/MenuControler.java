package me.tj.system.menu;

import me.tj.common.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/10 17:22
 */
@RestController
@RequestMapping("menu")
public class MenuControler {

    /**
     * todo
     * @return
     */
    @GetMapping("")
    public HttpResult getMenuByUser(){
        return null;
    }
}
