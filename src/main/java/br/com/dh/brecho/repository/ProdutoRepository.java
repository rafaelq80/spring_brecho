package br.com.dh.brecho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dh.brecho.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
