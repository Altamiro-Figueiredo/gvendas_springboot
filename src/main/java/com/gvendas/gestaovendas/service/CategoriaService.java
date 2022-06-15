package com.gvendas.gestaovendas.service;

import com.gvendas.gestaovendas.entities.Categoria;
import com.gvendas.gestaovendas.repositories.CategoriaRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodas(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorCodigo(Long codigo){
        return categoriaRepository.findById(codigo);

    }

}
