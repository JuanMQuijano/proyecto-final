package com.example.MicroservicioCursos.controller;

import com.example.MicroservicioCursos.persistence.entity.Curso;
import com.example.MicroservicioCursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @GetMapping
    public List<Curso> getByTematica(@RequestParam("tematica") String tematica) {
        return cursoService.buscarPorTematica(tematica);
    }
    
}
