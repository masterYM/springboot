package com.dl.config;

import com.dl.condition.TulingAspect;
import com.dl.condition.TulingConditional;
import com.dl.condition.TulingLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CondtionConfig {

    @Bean
    public TulingAspect tulingAspect() {
        return new TulingAspect();
    }

    @Conditional(value = TulingConditional.class)
    @Bean
    public TulingLog tulingLog() {
        return new TulingLog();
    }
}
