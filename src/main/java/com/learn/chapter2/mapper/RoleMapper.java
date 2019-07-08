package com.learn.chapter2.mapper;

import com.learn.chapter2.po.Role;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-01 11:14
 */
public interface RoleMapper {
    Role getRole(Long id);
    int insertRole(Role role);
    int deleteRole(Long id);
}
