package edu.fudanselab.trainticket.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import edu.fudanselab.trainticket.entity.User;
import edu.fudanselab.trainticket.repository.UserRepository;
import edu.fudanselab.trainticket.service.UserService;


import java.util.UUID;

/**
 * @author fdse
 */
@Component
public class UserInitUser implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {
        User whetherExistUser = userRepository.findByUserName("fdse_microservice");
        User user = User.builder()
                .userId("4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f")
                .userName("fdse_microservice")
                .password("111111")
                .gender(1)
                .documentType(1)
                .documentNum("2135488099312X")
                .email("trainticket_notify@163.com").build();
        user.setUserId("4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f");
        if (whetherExistUser == null) {
            userRepository.save(user);
        }
    }
}