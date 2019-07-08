package com.learn.chapter4.mapper;

import com.learn.chapter2.po.Role;
import com.learn.chapter4.params.RoleParam;

import java.util.List;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-01 11:14
 */
public interface RoleMapper {
    public List<Role> findRoleByParams(RoleParam params);
}
