package com.wdjr.springbootquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接返回给浏览器（如果是对象转为json数据）
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    /**
     * 诈骗王
     * 但是还有书籍2
     * 宇宙
     * 富豪在谷底求翻身
     * 心智斗争
     * 货币崛起
     * 女人
     * 解码比尔盖茨
     * 绿色星球
     * @return
     */
    @RequestMapping("/hello")
    public  String  hello(){
        return "hello world";
    }
    //REST API
}
