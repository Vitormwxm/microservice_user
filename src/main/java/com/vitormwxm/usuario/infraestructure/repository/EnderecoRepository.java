package com.vitormwxm.usuario.infraestructure.repository;

import com.vitormwxm.aprendendospring.infraestructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
