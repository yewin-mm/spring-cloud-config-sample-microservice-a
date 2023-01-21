package pers.yewin.springcloudconfigsamplemicroservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringCloudConfigSampleMicroserviceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigSampleMicroserviceAApplication.class, args);
    }

}
