package com.dhoouglas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhoouglas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}


