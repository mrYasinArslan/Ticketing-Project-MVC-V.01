package com.cydeo.services.impl;

import com.cydeo.dto.RoleDto;
import com.cydeo.services.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RoleServiceImpl extends AbstractMapService<RoleDto, Long> implements RoleService {
    @Override
    public RoleDto save(RoleDto object) {
        return super.save(object.getId(), object);
    }

    @Override
    public List<RoleDto> findAll() {
        return super.findAll();
    }


    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public RoleDto findById(Long id) {
        return super.findById(id);
    }
}
