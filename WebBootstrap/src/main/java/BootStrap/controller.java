package BootStrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by student on 6/26/17.
 */
@Controller
public class controller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "header";
    }
}
