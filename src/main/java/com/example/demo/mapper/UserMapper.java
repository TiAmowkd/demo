package com.example.demo.mapper;


import com.example.demo.utils.SelectSql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wkd
 * @Date: 2020/4/24 15:05
 * @Description:
 */
//@Mapper
@Repository
public interface UserMapper {


    List<String> selectAllRow();


    /*  @Select("select * from user where ${column} = #{value}")
      OptionalUser findByColumn(@Param("column") String column, @Param("value") String value);*/
    //查询已经和未领养的总条数 搜索
    @SelectProvider(type = SelectSql.class, method = "searchCount")
    List<Map<String,Object>> select(@Param("list") List<String> list);

}
