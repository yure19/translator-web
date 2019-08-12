package com.translator.controller;

import com.translator.domain.TranslatorInput;
import com.translator.domain.TranslatorOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class TranslatorController {

    @Autowired
    TranslatorInput translatorInput;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("TranslatorInput", "input", translatorInput);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String submit(@ModelAttribute("input")TranslatorInput input,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        RestTemplate restTemplate = new RestTemplate();
        TranslatorOutput output = restTemplate.postForObject("http://localhost:8080/translator_rest_service_war_exploded/translate", input, TranslatorOutput.class);
        model.addAttribute("enPhrase", output.getEnPhrase());

        return "TranslatorInput";
    }
}
