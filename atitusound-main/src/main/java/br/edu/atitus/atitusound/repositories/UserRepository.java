package br.edu.atitus.atitusound.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.edu.atitus.atitusound.entities.UserEntity;

@Repository
public interface UserRepository extends GenericRepository<UserEntity>{
	
	Optional<UserEntity> findByUsername(String username);

}
