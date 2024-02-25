package com.cydeo.services.impl;


import com.cydeo.dto.RoleDto;
import com.cydeo.dto.UserDTO;
import com.cydeo.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl extends AbstractMapService<UserDTO,String > implements UserService {
    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getFirstName(), object );
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
super.deleteByID(id);
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }}

