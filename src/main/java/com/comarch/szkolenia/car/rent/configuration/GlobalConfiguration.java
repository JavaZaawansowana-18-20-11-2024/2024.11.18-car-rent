package com.comarch.szkolenia.car.rent.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfiguration.class, AppConfiguration2.class})
public class GlobalConfiguration {
}
