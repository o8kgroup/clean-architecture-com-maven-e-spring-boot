package com.o8k.converter;

import com.o8k.aluno.entity.Aluno;
import com.o8k.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {
    public Aluno toAluno(AlunoRequest request) {
        return Aluno.from(request.getName());
    }
}
