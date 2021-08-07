package com.o8k.repository;

import com.o8k.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {
}
