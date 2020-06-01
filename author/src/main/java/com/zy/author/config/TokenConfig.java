//package com.zy.author.config;
//
//import org.springframework.context.annotation.Bean;
//
////@Configuration
//public class TokenConfig {
//    private final static String SECRET = "UAA-SECRET";
//
//    /**
//     * 基于内存存储token
//     * @return
//     */
////    @Bean
////    public TokenStore getTokenStore() {
////        return  new InMemoryTokenStore();
////    }
//
//
//    @Bean
//    public TokenStore getJwtTokenStore() {
//        return  new JwtTokenStore(accessTokenConvert());
//    }
//
//    @Bean
//    public JwtAccessTokenConverter accessTokenConvert() {
//        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
//        jwtAccessTokenConverter.setSigningKey(SECRET);
//        return  jwtAccessTokenConverter;
//
//    }
//}
