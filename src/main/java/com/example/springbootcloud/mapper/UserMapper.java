package com.example.springbootcloud.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    String getUserNo(@Param("cardNo") String cardNo);
}
