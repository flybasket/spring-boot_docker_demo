package com.weir.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.weir.user.entity.User;

@Mapper
public interface UserMapper {
    int delete(Long id);

    int insert(User user);

    int insertDynamic(User user);

    int updateDynamic(User user);

    int update(User user);

    User selectById(Long id);
}