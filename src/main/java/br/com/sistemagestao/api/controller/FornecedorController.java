package br.com.sistemagestao.api.controller;

import br.com.sistemagestao.api.model.Fornecedor;
import br.com.sistemagestao.api.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarFornecedor(@RequestBody Fornecedor fornecedor) {
        fornecedorService.criarFornecedor(fornecedor);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Fornecedor> listarTodosFornecedores() {
       return  fornecedorService.listarTodosFornecedores();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Fornecedor> buscarFornecedorPorId(@PathVariable Long id) {
        return fornecedorService.buscarFornecedorPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarFornecedorPorId(@PathVariable Long id) {
        fornecedorService.deletarFornecedorPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarFornecedorPorId(@PathVariable Long id, @RequestBody Fornecedor fornecedorAtualizadoNoFront) {
        fornecedorService.atualizarFornecedorPorId(id, fornecedorAtualizadoNoFront);
    }



}
