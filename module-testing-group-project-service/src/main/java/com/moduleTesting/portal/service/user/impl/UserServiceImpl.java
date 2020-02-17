package com.moduleTesting.portal.service.user.impl;

import com.moduleTesting.portal.dto.UserDto;
import com.moduleTesting.portal.dto.UserRole;
import com.moduleTesting.portal.repository.UserRepository;
import com.moduleTesting.portal.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public List<UserDto> findAllDrivers() {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public UserDto editUser(Integer userId, String lastName, String firstName, String patronymic, Date birthday) {
        return null;
    }

    @Override
    public UserDto changeUserStatus(Integer userId, UserRole userRole) {
        return null;
    }

    @Override
    public void transferMoney(Integer userId, Float money) {
    }

    @Override
    public List<UserDto> deleteUser(Integer userId) {
        return null;
    }

    @Override
    public void createNewUser(String lastName, String firstName, String patronymic, Date birthday, String email,
                              String password, Integer roleId, Integer statusId) {
    }

}
