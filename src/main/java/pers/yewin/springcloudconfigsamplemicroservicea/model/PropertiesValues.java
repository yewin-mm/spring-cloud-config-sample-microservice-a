package pers.yewin.springcloudconfigsamplemicroservicea.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-sample-microservice-a
 * @package: pers.yewin.springcloudconfigsamplemicroservicea.model
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesValues {
    private String value;
    private String withoutEncryptedValue;
    private String encryptedValue;
    private String fileServerAddress;
    private String fileServerPassword;
    private String databasePassword;
    private String thirdpartyApiUrl;
    private String thirdpartyClientSecret;
}
