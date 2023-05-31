package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.CuaHang;
import tiennh21.sd17321.repositories.CuaHangRepository;
import tiennh21.sd17321.request.CuaHangVM;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/cua-hang")
public class CuaHangController {
    @Autowired
    private CuaHangRepository cuaHangRepo;

    @Autowired
    @Qualifier("vm2")
    private CuaHangVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("ch", vm);
        model.addAttribute("action", "/admin/cua-hang/store");

        return "admin/cua_hang/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
        @PathVariable("id") CuaHang cuaHang,
        Model model
    ) {
        vm.loadFromEntity(cuaHang);
        model.addAttribute("ch", vm);
        model.addAttribute("action", "/admin/cua-hang/update/" + cuaHang.getId());
        return "admin/cua_hang/create";
    }

    @PostMapping("update/{id}")
    public String update(
        @PathVariable("id") CuaHang cuaHang,
        @Valid CuaHangVM vm,
        BindingResult result,
        Model model
    ) {
        cuaHang.loadFromVM(vm);
        this.cuaHangRepo.save(cuaHang);
        return "redirect:/admin/cua-hang/index";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("ch") CuaHangVM vm,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/cua_hang/create";
        }

        CuaHang ch = new CuaHang();
        ch.loadFromVM(vm);
        this.cuaHangRepo.save(ch);

        return "redirect:/admin/cua-hang/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<CuaHang> ds = this.cuaHangRepo.findAll();
        model.addAttribute("data", ds);
        return "admin/cua_hang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") CuaHang cuaHang)
    {
        this.cuaHangRepo.delete(cuaHang);
        return "redirect:/admin/cua-hang/index";
    }
}
