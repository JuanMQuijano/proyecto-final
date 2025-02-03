package com.example.MicroservicioCursos.service.impl;

import com.example.MicroservicioCursos.persistence.entity.Curso;
import com.example.MicroservicioCursos.service.ICursoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    static List<Curso> cursos = new ArrayList<>(List.of(
            new Curso("Java Básico", 60, 190.0, "Programación"),
            new Curso("Python", 80, 100.0, "Programación"),
            new Curso("HTML", 50, 80.0, "Web"),
            new Curso("Linux", 100, 220.0, "Sistemas"),
            new Curso("Angular", 90, 170.0, "Web")

    ));

    public List<Curso> buscarPorTematica(String tematica) {
        return cursos.stream().filter(c -> c.getTematica().equals(tematica)).toList();
    }

}
