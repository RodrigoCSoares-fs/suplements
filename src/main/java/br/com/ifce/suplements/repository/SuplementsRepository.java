package br.com.ifce.suplements.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifce.suplements.model.Suplements;

@Repository
public interface SuplementsRepository extends JpaRepository<Suplements, Long> {

}