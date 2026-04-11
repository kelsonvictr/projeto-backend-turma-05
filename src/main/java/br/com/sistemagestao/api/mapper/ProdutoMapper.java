package br.com.sistemagestao.api.mapper;

import br.com.sistemagestao.api.dto.produto.ProdutoRequestDTO;
import br.com.sistemagestao.api.dto.produto.ProdutoResponseDTO;
import br.com.sistemagestao.api.model.Fornecedor;
import br.com.sistemagestao.api.model.Produto;

public class ProdutoMapper {

    // Intenção: O front quer DTO e o banco quer Entity
    // Aqui convertemos DTO para Entity e Entity para DTO

    public static Produto toEntity(ProdutoRequestDTO dto, Fornecedor fornecedor) {
        Produto produto = new Produto();

        produto.setNome(dto.nome());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setQuantidadeEstoque(dto.quantidadeEstoque());
        produto.setCategoria(dto.categoria());
        produto.setFornecedor(fornecedor);

        return produto;
    }

    public static ProdutoResponseDTO toResponseDTO(Produto produto) {

        ProdutoResponseDTO dto = new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getQuantidadeEstoque(),
                produto.getCategoria(),
                produto.getFornecedor().getId(),
                produto.getFornecedor().getNomeFantasia()
        );

        return dto;
    }
}
