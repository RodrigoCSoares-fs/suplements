package br.com.ifce.suplements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifce.suplements.model.Suplements;
import br.com.ifce.suplements.repository.SuplementsRepository;

@Service
public class SuplementsService {
  @Autowired
  private SuplementsRepository repositorySuplement;

  public void saveService(Suplements suplement) {
    repositorySuplement.save(suplement);
  }

  public List<Suplements> listar() {
    return repositorySuplement.findAll();
  }

  public void excluir(Long id) {
    repositorySuplement.deleteById(id);
  }
}
