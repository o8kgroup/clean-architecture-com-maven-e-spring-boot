package com.o8k.controller;

import com.o8k.aluno.usecase.RegistroAluno;
import com.o8k.converter.AlunoRequestConverter;
import com.o8k.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    @Autowired
    private RegistroAluno registroAluno;
    @Autowired
    private AlunoRequestConverter requestConverter;

    @GetMapping
    public String doYouHearMe(){
        return "I Hear you 🥰";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request) {
        var aluno = requestConverter.toAluno(request);

        this.registroAluno.save(aluno);
    }
}
