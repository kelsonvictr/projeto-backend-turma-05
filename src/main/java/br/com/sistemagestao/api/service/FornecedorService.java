package br.com.sistemagestao.api.service;

import br.com.sistemagestao.api.model.Fornecedor;
import br.com.sistemagestao.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public void criarFornecedor(Fornecedor fornecedor) {
        fornecedorRepository.save(fornecedor);
    }
}
