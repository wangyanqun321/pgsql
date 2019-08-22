package com.example.pgsql.mapper;

import com.example.pgsql.domain.Stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper {

    Stu getStu(int id);
}
