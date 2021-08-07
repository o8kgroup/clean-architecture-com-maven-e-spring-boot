package com.o8k.repository;

import com.o8k.aluno.contract.AlunoRepository;
import com.o8k.aluno.entity.Aluno;
import com.o8k.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    @Autowired
    AlunoDao alunoDao;

    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));
    }
}
