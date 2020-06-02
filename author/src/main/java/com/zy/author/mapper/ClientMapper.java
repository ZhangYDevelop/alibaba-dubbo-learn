package com.zy.author.mapper;

import com.zy.author.support.Clients;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClientMapper {

    @Select("select * from oauth_clients where client_id = #{clientid}")
    Clients getClientsByClentId(@Param("clientid") String clientid);
}
