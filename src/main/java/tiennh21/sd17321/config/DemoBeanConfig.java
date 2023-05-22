package tiennh21.sd17321.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tiennh21.sd17321.request.CuaHangVM;

@Configuration
public class DemoBeanConfig {
    @Bean("vm1")
    public CuaHangVM getCuaHangVM1()
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setMa("CH01");
        vm.setTen("Cua hang 1");
        return vm;
    }

    @Bean("vm2")
    public CuaHangVM getCuaHangVM2()
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setMa("CH02");
        vm.setTen("Cua hang 2");
        return vm;
    }
}
