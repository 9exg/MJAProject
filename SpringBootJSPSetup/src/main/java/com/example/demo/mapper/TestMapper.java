package com.example.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


// mybatis spring boot 버전의 dao
@Mapper
public interface TestMapper {
	
	/* @Select("SELECT * FROM MJATEST") */
	List <HashMap<String, Object>> findAll() ;
	
	/* @Select("SELECT * FROM MJATEST WHERE TESTINT = #{params}") */
	HashMap<String, Object> selectOne(int params) ;

}
