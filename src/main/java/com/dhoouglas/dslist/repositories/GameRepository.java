package com.dhoouglas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoouglas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
