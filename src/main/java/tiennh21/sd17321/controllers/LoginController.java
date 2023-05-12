package tiennh21.sd17321.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tiennh21.sd17321.request.Account;

import java.util.Optional;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
//    public String login(
//        @RequestParam("email") String email,
//        @RequestParam("password") Optional<String> pwd,
//        @RequestParam(name="remember", defaultValue = "false") boolean remember
//    ) {
    public String login(Account acc) {
        System.out.println(acc.getEmail());
        System.out.println(acc.getPassword());

//        if (pwd.isPresent()) {
//            System.out.println(pwd.get());
//        } else {
//            System.out.println("Password Empty");
//        }

        return "login";
    }
}
