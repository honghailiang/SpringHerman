package com.herman.springherman.dao;

import com.herman.springherman.model.HermanUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HermanUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HermanUser record);

    int insertSelective(HermanUser record);

    HermanUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HermanUser record);

    int updateByPrimaryKey(HermanUser record);
}