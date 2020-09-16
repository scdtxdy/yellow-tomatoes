package com.scd.modules.system.service.mapper;

import com.scd.common.mapper.CoreMapper;
import com.scd.modules.system.domain.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@Mapper
public interface MenuMapper extends CoreMapper<Menu> {


    /**
     * 根据菜单的 PID 查询
     * @param pid /
     * @return /
     */
    @Select("SELECT * from menu m where m.pid = #{pid} ")
    List<Menu> findByPid(@Param("pid") long pid);

    @Select("select m.* from menu m LEFT JOIN roles_menus t on m.id= t.menu_id LEFT JOIN role r on r.id = t.role_id where r.id = #{roleId}")
    Set<Menu> findMenuByRoleId(@Param("roleId") Long roleId);
    @Select("<script>select m.* from menu m LEFT OUTER JOIN roles_menus t on m.id= t.menu_id LEFT OUTER JOIN role r on r.id = t.role_id where m.type!=2 and  r.id in <foreach collection=\"roleIds\" index=\"index\" item=\"item\" open=\"(\" separator=\",\" close=\")\">#{item}</foreach> order by m.sort asc</script>")
    List<Menu> selectListByRoles(@Param("roleIds") List<Long> roleIds);
}
