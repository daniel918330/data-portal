package com.duoyouhui.data.portal

-portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 *
 * @author bance
 * @date 2024/11/28
 **/
@RestController
public class HealthyController {

    @GetMapping("/healthy/check")
    public String check(){
        return "ok";
    }
    @GetMapping("favicon.ico")
    public void returnNoFavicon() {
    }
}
