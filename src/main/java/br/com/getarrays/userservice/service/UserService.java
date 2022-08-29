package br.com.getarrays.userservice.service;

import br.com.getarrays.userservice.model.AppUser;
import br.com.getarrays.userservice.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
