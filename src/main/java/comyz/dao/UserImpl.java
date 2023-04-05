package comyz.dao;

import comyz.entities.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface UserImpl{
    @Select("select u.id,u.name,u.sex,u.addr,u.birth,u.password,u.hand,u.gs_id,g.yuangong from us u,gongsi g where u.gs_id=g.sid limit #{pageno},#{pagesize};")
    public  List<User> userquery(@Param("pageno") int pageno, @Param("pagesize") int pagesize);

    @Select("select * from us  where id=#{id}")
    public  User queryid(int id);

    @Select("select * from us u,gongsi g where u.gs_id=g.sid")
    public  List<User> queryUser();

    @Select("select count(*) from us")
    public int counts(int pagesize);

    @Select("select count(*) from us")
    public int count(@Param("pagesize")int pagesize,@Param("pageno")int pageno);

    @Insert("insert into us (name,sex,addr,birth,password,hand,gs_id) values(#{name},#{sex},#{addr},#{birth},#{password},#{hand},#{gs.sid});")
    public void userinsert(User user);

    @Update("update us set name=#{name},sex=#{sex},addr=#{addr},birth=#{birth},password=#{password},hand=#{hand},gs_id=#{gs_id} where id=#{id};")
    public void userupdate(User user);

    @Delete("delete from us where id =#{id}")
    public void userdelete(int id);
}
