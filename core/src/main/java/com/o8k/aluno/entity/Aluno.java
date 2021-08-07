package com.o8k.aluno.entity;

import java.util.UUID;

public class Aluno {
    private final UUID registrationNumber;
    private final String name;

    public Aluno(String name)  {
        this.name = name;
        this.registrationNumber = UUID.randomUUID();
    }
    public UUID getRegistrationNumber() {
        return registrationNumber;
    }
    public String getName() {
        return name;
    }
}
