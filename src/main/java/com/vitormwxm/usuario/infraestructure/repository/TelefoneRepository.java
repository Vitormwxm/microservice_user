package com.vitormwxm.usuario.infraestructure.repository;

import com.vitormwxm.aprendendospring.infraestructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
