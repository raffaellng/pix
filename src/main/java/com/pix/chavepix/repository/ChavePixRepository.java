package com.pix.chavepix.repository;

import com.pix.chavepix.domain.ChavePix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChavePixRepository extends JpaRepository<ChavePix, Integer> {

}
