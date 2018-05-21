package com.space.mybatisrediscache.mapper;

import com.space.mybatisrediscache.bo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/8 13:29
 * @email 1529949535@qq.com
 */
@Component
@Mapper
public interface UserMapper {

    int save(User user);

    List<User> getAll();

    int delete(Long id);
}
