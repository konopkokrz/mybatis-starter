package com.example.mybatisstarter;

import com.example.mybatisstarter.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<String> getUserIds() {
        return userMapper.getUserIds();
    }
}