package br.upe.piii.exemplo.model;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.cotext.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LugarDaoTest {
	
	@Autowired
	private ILugarDAO dao;
	
	@Test
	public void testeIncluirComSucesso() {
		
		final Long existentes = dao.count();
		Lugar sala = new Lugar("Sala","Do lado so sofá");
		Lugar jardim = new Lugar("Jardim","Ao lado da piscina");
		Lugar quintal = new Lugar("Quintal","Do lado da janela");
		dao.saveAll(Arrays.asList(sala, jardim, quintal));
		
		final List <Lugar> lugaresInseridos = (List<Lugar>) dao.findAll();
		Long novaQuantidade = existentes + 3;
		assertThat(lugaresInseridos.size(), is(equalTo(novaQuantidade)));
		
	
	
	}

}
