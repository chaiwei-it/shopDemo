package com.mood.module.api.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块
 * @author chaiwei
 * @time 2017-11-25 下午08:00
 */
@RestController
@RequestMapping("/")
public class AppApi {

//    @Autowired
//    private AppService appService;

    @GetMapping("")
    public String getApps(){
//        JSONObject param = new JSONObject();
//        param.put("name","test");
//        App app = appService.selectById("6e640e63ef5e4c2c93f81da6a7f87bf9");
        return "连接成功";
    }

}
