package pers.yewin.springcloudconfigsamplemicroservicea.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.yewin.springcloudconfigsamplemicroservicea.service.TestService;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-sample-microservice-a
 * @package: controller
 */

@RestController
@Slf4j
//@RefreshScope
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getValueByUsingConfigProperties")
    public ResponseEntity getValueByUsingConfigProperties(){
        return testService.getValueByUsingConfigProperties();
    }

    @GetMapping("/getValueByUsingValueAnnotation")
    public ResponseEntity getValueByUsingValueAnnotation(){
        return testService.getValueByUsingValueAnnotation();
    }
}
