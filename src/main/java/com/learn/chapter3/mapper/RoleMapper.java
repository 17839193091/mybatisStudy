package com.learn.chapter3.mapper;

import com.learn.chapter2.po.Role;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-01 11:14
 */
public interface RoleMapper {
    Role getRole(Long id);
    Role findRole(String roleName);
    int insertRole(Role role);
    int deleteRole(Long id);
}
