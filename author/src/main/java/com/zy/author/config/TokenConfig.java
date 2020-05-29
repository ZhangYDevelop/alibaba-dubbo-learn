package com.zy.author.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.stereotype.Component;

@Configuration
public class TokenConfig {
    private final static String SECRET = "UAA-SECRET";

    /**
     * 基于内存存储token
     * @return
     */
//    @Bean
//    public TokenStore getTokenStore() {
//        return  new InMemoryTokenStore();
//    }


    @Bean
    public TokenStore getJwtTokenStore() {
        return  new JwtTokenStore(accessTokenConvert());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConvert() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey(SECRET);
        return  jwtAccessTokenConverter;

    }
}
