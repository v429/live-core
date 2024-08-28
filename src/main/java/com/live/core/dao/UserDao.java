package com.live.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.live.core.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
