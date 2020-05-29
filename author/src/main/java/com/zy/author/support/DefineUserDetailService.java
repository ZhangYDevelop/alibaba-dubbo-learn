package com.zy.author.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class DefineUserDetailService implements UserDetailsService {
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Set<GrantedAuthority> grantedAuthorities =  new HashSet();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("admin");
        grantedAuthorities.add(grantedAuthority);
        return new User("admin","$2a$10$ODoZJKtLmhwpdfeoU08Q7OqrpftHfWpaBGhsRG.Xw4XRk69/RkLR.",grantedAuthorities);
    }
}
