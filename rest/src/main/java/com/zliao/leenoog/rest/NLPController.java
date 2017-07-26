package com.zliao.leenoog.rest;

import com.zliao.leenoog.service.NLPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zliao
 *         POST http://127.0.0.1:9988/nlp/help
 *         Request Body:
 *         {
 *         }
 */

@RestController
@RequestMapping("/nlp")
public class NLPController {
    @Autowired
    NLPService nlpService;

    @RequestMapping(value = "/help", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String handleVoiceASR(HttpServletRequest request) {
        return "This is for NLP testing";
    }

    @RequestMapping(value = "/hanlp", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String handleHaNLP(HttpServletRequest request) {
        return nlpService.hanlp_seg("测试实用的用具，喔，是用句语料");
    }
}
