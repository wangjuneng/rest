package com.ztesoft.zsmart.wj.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * <Description> 全局异常处理<br>
 * 
 * @author xu.hong<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate Nov 25, 2016 <br>
 * @since V8.1<br>
 * @see com.ztesoft.zsmart.bss.crm.rest.impl <br>
 */
@Component
public class RestExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
        Exception ex) {
        Map<String, String> map = new HashMap<String, String>();
        String code = "";
        String desc = ex.getMessage();
        int type = 0;
        Date time = null;
        
            desc = ex.getMessage();
        map.put("ErrorCode", code);
        map.put("ErrorMessage", desc);
        map.put("ErrorType", type + "");
        map.put("ErrorTime", time.toLocaleString());

        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView(), map);
        return modelAndView;
    }
}
