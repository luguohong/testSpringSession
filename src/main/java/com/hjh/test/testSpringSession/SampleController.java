package com.hjh.test.testSpringSession;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    private final static Logger logger = LoggerFactory.getLogger(SampleController.class);
    

    @ResponseBody
	@RequestMapping("/aa")
	String getAllUser(HttpServletRequest request) {
		
		return "hello";
	}
    
    @ResponseBody
    @RequestMapping(value = "/4040404")
    public String handleError2(HttpServletRequest request) {
        return "404";
    }

}
