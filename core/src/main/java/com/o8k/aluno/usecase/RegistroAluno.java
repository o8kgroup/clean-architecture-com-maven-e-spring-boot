package com.o8k.aluno.usecase;

import com.o8k.aluno.contract.AlunoRepository;
import com.o8k.aluno.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {
    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
