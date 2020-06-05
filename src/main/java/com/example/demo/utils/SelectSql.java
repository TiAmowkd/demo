package com.example.demo.utils;

import java.util.List;
import java.util.Map;

/**
 * @auther: asus
 * @date: 2020/6/4 15:53
 * @version: 1.0
 * @description:
 */
public class SelectSql {

    public String searchCount(Map<String,Object> map){
        List<String> list= (List<String>) map.get("list");
        String sql="select ";
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if(i == list.size()-1 ){
                    sql += list.get(i);
                }else {
                    sql += list.get(i)+",";
                }
            }
        }
        sql += " from user";

        System.err.println("Sql 语句 是"+sql);
        return sql;
    }
}
