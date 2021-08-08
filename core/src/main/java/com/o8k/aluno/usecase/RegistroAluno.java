package com.o8k.aluno.usecase;

import com.o8k.aluno.contract.AlunoRepository;
import com.o8k.aluno.contract.RegistroAlunoBorda;
import com.o8k.aluno.entity.Aluno;

import java.util.UUID;

public class RegistroAluno implements RegistroAlunoBorda {

    AlunoRepository alunoRepository;

    public RegistroAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void save(Aluno aluno) {
        aluno.setRegistrationNumber(UUID.randomUUID());
        alunoRepository.save(aluno);
    }
}
