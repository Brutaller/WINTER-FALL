package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Azat Zaripov on 07.11.2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String getIndexPage(){
        return "index";
    }

}
