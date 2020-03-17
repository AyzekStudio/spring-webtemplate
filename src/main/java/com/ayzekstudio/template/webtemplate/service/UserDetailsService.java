package com.ayzekstudio.template.webtemplate.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException;
}
