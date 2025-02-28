package com.duoyouhui.data.portal.infrastructure.nacos;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2024 DYH Info. Tech Ltd. All rights reserved.
 * <p></p>
 *
 * @author Evan Xuan
 * @version 1.0.0
 * @date 2024/11/29
 */
@Component
@ConfigurationProperties("config")
@Data
public class NacosConfig {


}
