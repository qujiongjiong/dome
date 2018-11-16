package cn.kgc.mapper;

import cn.kgc.entity.User;


import java.util.List;

public interface UserMapper {
    public int add(User user);
    public int del(Integer id);
    public int updata(User user);
    public User getUserById(Integer id);
    public List<User> all();
    public User login(User user);
}
