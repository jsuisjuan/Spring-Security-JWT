package br.com.getarrays.userservice.repo;

import br.com.getarrays.userservice.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
