package br.com.jornadaMilhas.repository;

import br.com.jornadaMilhas.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserProfile, Long> {
}
