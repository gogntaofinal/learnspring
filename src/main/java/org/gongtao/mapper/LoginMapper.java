package org.gongtao.mapper;

import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    /**
     * gongtao
     * @param username
     * @param password
     * @return
     */
    int isPermiteUser(@Param(value = "username") String username, @Param(value = "password")  String password);
}
