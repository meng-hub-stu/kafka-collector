package com.bfxy.collector.web;

import com.bfxy.collector.util.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Mengdexin
 * @date 2022 -05 -22 -21:58
 */
@RestController
@Slf4j
public class IndexController {
    @RequestMapping(value = "/index")
    public String index() {
        InputMDC.putMDC();

        log.info("我是一条info日志");

        log.warn("我是一条warn日志");

        log.error("我是一条error日志");
        return "idx";
    }

    @RequestMapping(value = "/err")
    public String err() {
        try{
            int i = 1/0;
        }catch (Exception e) {
            log.error("算数错误", e);
        }
        return "err";
    }

}
