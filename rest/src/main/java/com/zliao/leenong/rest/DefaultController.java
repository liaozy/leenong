package com.zliao.leenong.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zliao
 *
 */

@RestController
@RequestMapping("/")
public class DefaultController {

    private final static Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @RequestMapping(method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String hello (){
        logger.info("this is leenong server");
        return "Hi, this is leenong server";


    }
}
