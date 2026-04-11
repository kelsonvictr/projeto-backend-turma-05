package br.com.sistemagestao.api.service;

import br.com.sistemagestao.api.dto.produto.ProdutoRequestDTO;
import br.com.sistemagestao.api.dto.produto.ProdutoResponseDTO;

import java.util.List;

public interface ProdutoService {
    ProdutoResponseDTO criarProduto(ProdutoRequestDTO dto);
    List<ProdutoResponseDTO> listarTodosProdutos();
    ProdutoResponseDTO buscarProdutoPorId(Long id);
    ProdutoResponseDTO atualizarProdutoPorId(Long id, ProdutoRequestDTO dto);
    void deletarProdutoPorId(Long id);
}
