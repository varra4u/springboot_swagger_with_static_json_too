package com.varra.swagger.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method= RequestMethod.GET)
    void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
