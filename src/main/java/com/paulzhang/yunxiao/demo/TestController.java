package com.paulzhang.yunxiao.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by PaulZhang on 2020/3/26.
 */
@RestController("test")
public class TestController {

    @PostMapping("/path")
    public Mono<String> testPath() {
        return Mono.just("Test Data");
    }
}
