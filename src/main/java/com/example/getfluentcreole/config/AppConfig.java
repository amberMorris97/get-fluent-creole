package com.example.getfluentcreole.config;

import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new PasswordEncoder() {
            @Override
            public @Nullable String encode(@Nullable CharSequence rawPassword) {
                return "";
            }

            @Override
            public boolean matches(@Nullable CharSequence rawPassword, @Nullable String encodedPassword) {
                return false;
            }
        };
    }
}
