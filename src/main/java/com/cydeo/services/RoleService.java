package com.cydeo.services;

import com.cydeo.dto.RoleDto;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Role;

import java.util.List;

public interface RoleService extends CrudService<RoleDto,Long> {

    //save, findById, Delete,Update, FindAll,   crud operator.
    //when ever you save you are returning this user DTO and repository will take this user DTO and
    //map it to entity and it is  gone save in  database
    //Some times after you save, you need to access that object base on  the certain unique thing either
    //ID primary key or user name, At that time still we  need the object. Thats why you are returning.
    //And in the error handling we will use this kind of definiton. Basicly when ever we save dont use void, use return object after save.

    //Instead of below, we used generics for mutual service parameter.
//    RoleDto save(RoleDto roleDto);
//    RoleDto findByID(Long id);
//    List<RoleDto> findAll();
//   void delete(RoleDto role);
//    void deleteByID(Long id);


}
