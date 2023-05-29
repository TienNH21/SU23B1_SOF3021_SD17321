package tiennh21.sd17321.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiennh21.sd17321.entities.CuaHang;

@Repository
public interface CuaHangRepository
    extends JpaRepository<CuaHang, String> {
}
