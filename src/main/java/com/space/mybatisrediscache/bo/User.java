package com.space.mybatisrediscache.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhuzhe
 * @date 2018/5/8 13:29
 * @email 1529949535@qq.com
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 8546818294391453293L;

    private Long id;

    private String userName;

    private String email;
}
