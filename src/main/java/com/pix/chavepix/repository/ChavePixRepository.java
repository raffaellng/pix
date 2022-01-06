package com.pix.chavepix.repository;

import com.pix.chavepix.domain.ChavePix;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChavePixRepository extends JpaRepository<ChavePix, Integer> {
    Optional<ChavePix> findByIdAndStatusChaveTrue(Integer integer);
}
