package br.com.ribeirao.surveyweb.port.adapter.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SurveyWebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/index.jhtml";
    }

    @RequestMapping(value = "/index.jhtml", method = RequestMethod.GET)
    public String indexHtml() {
        return "index";
    }

}
