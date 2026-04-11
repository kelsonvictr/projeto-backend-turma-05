package br.com.sistemagestao.api.dto.produto;

import br.com.sistemagestao.api.enums.CategoriaProdutoEnum;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        Integer quantidadeEstoque,
        CategoriaProdutoEnum categoria,
        Long fornecedorId,
        String fornecedorNome
) {
}
