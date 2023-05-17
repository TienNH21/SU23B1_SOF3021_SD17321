package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.request.CuaHangVM;

@Controller
@RequestMapping("admin/cua-hang")
public class CuaHangController {
    @GetMapping("create")
    public String create(Model model)
    {
        CuaHangVM ch = new CuaHangVM();
        ch.setMa("CH001");
        ch.setTen("Cua Hang TVB");
        model.addAttribute("ch", ch);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("ch") CuaHangVM vm,
        BindingResult result
    ) {
        return "admin/cua_hang/create";
    }
}