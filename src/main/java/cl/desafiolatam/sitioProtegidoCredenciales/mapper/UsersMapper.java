package cl.desafiolatam.sitioProtegidoCredenciales.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cl.desafiolatam.sitioProtegidoCredenciales.model.Users;

public interface UsersMapper {
	
	@Select("select * from users where email = #{email}")
	Users findByEmail(@Param("email") String email);
}
