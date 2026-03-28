package br.com.sistemagestao.api.controller;

import br.com.sistemagestao.api.model.Fornecedor;
import br.com.sistemagestao.api.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
