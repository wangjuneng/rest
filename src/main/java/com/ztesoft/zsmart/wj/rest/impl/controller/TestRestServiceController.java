package com.ztesoft.zsmart.wj.rest.impl.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ztesoft.zsmart.wj.rest.intf.model.Greeting;
import com.ztesoft.zsmart.wj.rest.intf.service.TestRestService;

@Api(value="testRest",description="test rest service controller")
@RestController
@RequestMapping(path="/test")
public class TestRestServiceController {
    
    @Autowired
    private TestRestService testRestService;
    
    @ApiOperation(value="greeting",notes="test greeting",tags={"test"})
    @RequestMapping(path="/greeting",method={RequestMethod.GET},produces={"application/json" })
    public Greeting greeting(@RequestParam(value="name",defaultValue="kitty") String name){
        return testRestService.greet(name);
    }

    public void setTestRestService(TestRestService testRestService) {
        this.testRestService = testRestService;
    }
}
