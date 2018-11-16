package cn.kgc.serviceImpl;

import cn.kgc.entity.User;
import cn.kgc.mapper.UserMapper;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int del(Integer id) {
        return userMapper.del(id);
    }

    @Override
    public int updata(User user) {
        return userMapper.updata(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> all() {
        return userMapper.all();
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
