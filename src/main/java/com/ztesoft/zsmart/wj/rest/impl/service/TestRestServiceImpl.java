package com.ztesoft.zsmart.wj.rest.impl.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.ztesoft.zsmart.wj.rest.intf.model.Greeting;
import com.ztesoft.zsmart.wj.rest.intf.service.TestRestService;

@Service
public class TestRestServiceImpl implements TestRestService {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Override
    public Greeting greet(String name) {
        // TODO Auto-generated method stub
        return new Greeting(String.valueOf(counter.decrementAndGet()), String.format(template, name));
    }

}
