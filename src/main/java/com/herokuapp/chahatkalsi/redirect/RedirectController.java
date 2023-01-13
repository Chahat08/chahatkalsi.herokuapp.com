package com.herokuapp.chahatkalsi.redirect;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="redirect")
public class RedirectController {

    private static String projectUrl = "https://en.wikipedia.org/wiki/Burkhan_Khaldun";

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void method(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", this.projectUrl);
        httpServletResponse.setStatus(302);
    }

}
