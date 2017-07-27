package com.zliao.leenong.server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class AdminController {

    private final static Logger logger = LoggerFactory.getLogger(com.zliao.leenong.rest.DefaultController.class);

    @RequestMapping("/admin")
    @ResponseStatus(HttpStatus.OK)
    public String admin(Model model){
        return "admin";


    }
}