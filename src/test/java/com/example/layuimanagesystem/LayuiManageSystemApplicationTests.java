package com.example.layuimanagesystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class LayuiManageSystemApplicationTests {

    /**
     * 测试加密
     */
    @Test
    void contextLoads() {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode1 = passwordEncoder.encode("123456");
        String encode2 = passwordEncoder.encode("123456");
        System.out.println(encode1);
        System.out.println(encode2);

        boolean matches = passwordEncoder.matches("123456", encode1);
        System.out.println(matches);
    }

}
