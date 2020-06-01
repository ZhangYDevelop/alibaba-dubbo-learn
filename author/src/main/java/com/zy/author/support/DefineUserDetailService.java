package com.zy.author.support;

import com.zy.author.mapper.UserMapper;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DefineUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.getUserByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        List<GrantedAuthority> list = new ArrayList<>();
        if(!StringUtils.isEmpty(user.getRoles())) {
            String[] arr = user.getRoles().split(";");
            for (String s : arr) {
                list.add(new SimpleGrantedAuthority(s));
            }
        }
        user.setAuthorities(list);
        return user;
//        Set<GrantedAuthority> grantedAuthorities =  new HashSet();
//        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("admin");
//        grantedAuthorities.add(grantedAuthority);
//        return new User("admin","$2a$10$ODoZJKtLmhwpdfeoU08Q7OqrpftHfWpaBGhsRG.Xw4XRk69/RkLR.",grantedAuthorities);
    }
}
