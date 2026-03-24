package com.gerenciamento_de_fornecedores.demo.repository;

import com.gerenciamento_de_fornecedores.demo.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}