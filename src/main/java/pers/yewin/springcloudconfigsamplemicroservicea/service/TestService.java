package pers.yewin.springcloudconfigsamplemicroservicea.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pers.yewin.springcloudconfigsamplemicroservicea.config.AppConfigProperties;
import pers.yewin.springcloudconfigsamplemicroservicea.model.PropertiesValues;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-sample-microservice-a
 * @package: pers.yewin.springcloudconfigsamplemicroservicea.service
 */

@Service
@Slf4j
@RefreshScope // RefreshScope is used when you want to get update value by using @Value annotation.
public class TestService {


    /**
     * You can Reference about reading value from properties by using @ConfigurationProperties in below link
     * https://github.com/yewin-mm/reading-properties-file-values
     */
    @Autowired
    private AppConfigProperties appConfigProp;


    /**
     * You can Reference about reading value from properties by using @Value in below link
     * https://github.com/yewin-mm/reading-properties-file-values
     */
    @Value("${app.config.test.value}")
    private String value;

    @Value("${app.config.test.without-encrypted-value}")
    private String withoutEncryptedValue;

    @Value("${app.config.test.with-encrypted-value}")
    private String withEncryptedValue;

    @Value("${app.config.test.file-server-address}")
    private String fileServerAddress;

    @Value("${app.config.test.file-server-password}")
    private String fileServerPassword;

    @Value("${app.config.test.database-password}")
    private String databasePassword;

    @Value("${app.config.test.thirdparty-api-url}")
    private String thirdpartyApiUrl;

    @Value("${app.config.test.thirdparty-client-secret}")
    private String thirdPartyClientSecret;

    public ResponseEntity getValueByUsingConfigProperties(){

        PropertiesValues propertiesValues = new PropertiesValues(appConfigProp.getValue(),
                appConfigProp.getWithoutEncryptedValue(), appConfigProp.getWithEncryptedValue(),
                appConfigProp.getFileServerAddress(), appConfigProp.getFileServerPassword(),
                appConfigProp.getDatabasePassword(), appConfigProp.getThirdpartyApiUrl(),
                appConfigProp.getThirdpartyClientSecret());

        log.info("Properties Values by using Configuration Properties: {}", propertiesValues);
        return ResponseEntity.ok(propertiesValues);
    }


    /**
     * You need to use @RefreshScope annotation on the top of the class when you want to get updated changes values by using @Value annotation collaboration with Actuator `refresh` api.
     * But you don't need to use @RefreshScope when you get updated value from properties by using Configuration Properties (like above way).
     */
    public ResponseEntity getValueByUsingValueAnnotation(){
        PropertiesValues propertiesValues = new PropertiesValues(value, withoutEncryptedValue,
                withEncryptedValue, fileServerAddress, fileServerPassword, databasePassword,
                thirdpartyApiUrl, thirdPartyClientSecret);

        log.info("Properties Values by using Value annotation: {}", propertiesValues);
        return ResponseEntity.ok(propertiesValues);
    }
}
