package br.com.sistemagestao.api.controller;

import br.com.sistemagestao.api.dto.produto.ProdutoRequestDTO;
import br.com.sistemagestao.api.dto.produto.ProdutoResponseDTO;
import br.com.sistemagestao.api.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponseDTO criarProduto(@Valid @RequestBody ProdutoRequestDTO dto) {
        return produtoService.criarProduto(dto);
    }

}
