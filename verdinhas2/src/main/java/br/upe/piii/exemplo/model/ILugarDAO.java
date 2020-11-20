package br.upe.piii.exemplo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILugarDAO extends CrudRepository<Lugar, Long> {

}
