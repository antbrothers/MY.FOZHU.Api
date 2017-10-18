package com.ssm.promotion.core.dao;

import com.ssm.promotion.core.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@Repository
public interface UserDao {
    /**
     * 登录
     *
     * @param user
     * @return
     */
    public User login(User user);
    /**
     * 查找用户列表
     *
     * @param map
     * @return
     */
    public List<User> findUsers(Map<String, Object> map);
    public Long getTotalUser(Map<String, Object> map);
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer id);
}
