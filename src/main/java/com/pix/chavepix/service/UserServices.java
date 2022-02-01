package com.pix.chavepix.service;

import com.pix.chavepix.domain.Users;
import com.pix.chavepix.repository.UsersRepository;
import com.pix.chavepix.service.Interface.UsersInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServices implements UserDetailsService, UsersInterface {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepository.findByUser(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado na base de dados!"));

        return User.builder()
                .username(users.getUser())
                .password(users.getPassw())
                .build();
    }

    @Transactional
    public Users salvar(Users users) {
        users.setPassw(cripPasw(users.getPassw()));
        return userRepository.save(users);
    }

    private String cripPasw(String passw) {
        String senhaCriptografada = encoder.encode(passw);
        return senhaCriptografada;
    }
}
