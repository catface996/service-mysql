package com.catface996.mysql.repository.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author by catface
 * @date 2020/12/14
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRpServiceTest {

    @Autowired
    private TestRpService testRpService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void queryByUserName() {
        com.catface996.mysql.repository.entity.Test test = new com.catface996.mysql.repository.entity.Test();
        test.setAge(1);
        test.setUserName("xx");
        testRpService.save(test);

        List<com.catface996.mysql.repository.entity.Test> list = testRpService.queryByUserName("xx");
        log.info("result:{}", list);
    }

    @Test
    public void testRedis() {
        stringRedisTemplate.opsForValue().set("xxxx", "oooo");
        String value = stringRedisTemplate.opsForValue().get("xxxx");
        log.info("value:{}", value);
    }
}