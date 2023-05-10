package tiennh21.sd17321.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    // @RequestMapping(value="hello", method = RequestMethod.GET)
    // @PostMapping
    @GetMapping("hello")
    public String sayHello(Model model)
    {
        String name = "SD17321";
        model.addAttribute("name", name);
        return "hello";
    }
}
