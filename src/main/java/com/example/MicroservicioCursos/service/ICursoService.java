package com.example.MicroservicioCursos.service;

import com.example.MicroservicioCursos.persistence.entity.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> buscarPorTematica(String tematica);

}
