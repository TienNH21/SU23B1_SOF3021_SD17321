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
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("ch") CuaHangVM vm,
        BindingResult result
    ) {
        CuaHang ch = new CuaHang();
        ch.setMa( vm.getMa() );
        ch.setTen( vm.getTen() );
        ch.setDiaChi( vm.getDiaChi() );
        ch.setThanhPho( vm.getThanhPho() );
        ch.setQuocGia( vm.getQuocGia() );

        this.cuaHangRepo.save(ch);
        return "admin/cua_hang/create";
    }
}
