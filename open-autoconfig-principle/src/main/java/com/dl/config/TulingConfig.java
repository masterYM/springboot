package com.dl.config;

import com.dl.compent.TulingBeanDefinitionRegister;
import com.dl.compent.TulingImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@Import(value = {TulingImportSelector.class})
@Import(value = {TulingImportSelector.class, TulingBeanDefinitionRegister.class})
public class TulingConfig {
}
