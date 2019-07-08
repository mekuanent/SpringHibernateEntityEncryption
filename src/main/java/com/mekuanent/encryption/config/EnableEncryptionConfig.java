package com.mekuanent.encryption.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * A spring {@link Configuration configuration} class to scan all the components
 * inside the library
 *
 * @author Mekuanent Kassaye
 */
@Configuration
@ComponentScan(basePackages = {"com.mekuanent.encryption"})
public class EnableEncryptionConfig {
}
