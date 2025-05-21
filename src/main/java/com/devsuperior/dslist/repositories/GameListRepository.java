package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.devsuperior.dslist.Projections.GameMinProjection;

import com.devsuperior.dslist.entities.GamesList;

public interface GameListRepository extends JpaRepository<GamesList, Long> {

}