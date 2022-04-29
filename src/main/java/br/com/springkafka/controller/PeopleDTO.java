package br.com.springkafka.controller;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class PeopleDTO {

    private String name;
    private String cpf;
    private List<String> books;
}
