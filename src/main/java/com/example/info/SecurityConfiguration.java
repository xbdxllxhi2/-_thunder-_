package com.example.info;
//
//import org.keycloak.adapters.springsecurity.authentication.KeycloakLogoutHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//        private final KeycloakLogoutHandler keycloakLogoutHandler;
//
//        SecurityConfiguration(KeycloakLogoutHandler keycloakLogoutHandler) {
//            this.keycloakLogoutHandler = keycloakLogoutHandler;
//        }
//        @Bean
//        protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//            return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
//        }
//
//        @Bean
//        public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
//            return http.getSharedObject(AuthenticationManagerBuilder.class)
//                    .build();
//        }
//    }
