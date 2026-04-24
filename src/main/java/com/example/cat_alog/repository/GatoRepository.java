package com.example.cat_alog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cat_alog.model.Gato;

@Repository
public interface GatoRepository extends JpaRepository<Gato, Integer>{

}
