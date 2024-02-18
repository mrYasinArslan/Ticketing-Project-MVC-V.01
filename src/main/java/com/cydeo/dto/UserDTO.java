package com.cydeo.dto;

import com.cydeo.Enums.Gender;
import com.cydeo.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    private RoleDto role;
    private Gender gender;
}
