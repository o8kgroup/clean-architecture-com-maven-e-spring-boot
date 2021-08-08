package com.o8k.aluno.entity;

import java.util.UUID;

public class Aluno {
    private String name;
    private UUID registrationNumber;

    public static Aluno from(String name)  {
        Aluno aluno = new Aluno();
        aluno.name = name;
        return aluno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(UUID registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
