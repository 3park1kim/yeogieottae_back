package com.example.oauth;

import com.yeogieottae.utils.KakaoOauth2UserService;
import com.yeogieottae.utils.Oauth2SuccessHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig  {

    private final KakaoOauth2UserService kakaoOauth2UserService;
    private final Oauth2SuccessHandler oAuth2SuccessHandler;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated()
                )
                .oauth2Login()
                .defaultSuccessUrl("http://localhost:3000/home")
                .userInfoEndpoint()
                .userService(kakaoOauth2UserService)
                .and()
                .successHandler(oAuth2SuccessHandler);
        return http.build();
    }
}
