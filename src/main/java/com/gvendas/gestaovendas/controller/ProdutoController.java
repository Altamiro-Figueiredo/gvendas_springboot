package com.gvendas.gestaovendas.controller;

import com.gvendas.gestaovendas.entities.Produto;
import com.gvendas.gestaovendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarTodas(){
        return produtoService.listarTodas();
    }


    @GetMapping("/{codigo}")
    public ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Long codigo){
        Optional<Produto> produto = produtoService.buscarPorCodigo(codigo);
        return produto.isPresent() ? ResponseEntity.ok(produto) : ResponseEntity.notFound().build();
    }
}
