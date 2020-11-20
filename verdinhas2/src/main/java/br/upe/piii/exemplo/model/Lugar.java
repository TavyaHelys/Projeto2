package br.upe.piii.exemplo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



	@Entity
	public class Lugar {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		@Column(length = 50)
	    private String nome;
		private String descricao;
		
		public Lugar () {
			super();
		}
		public Lugar(String nome, String descricao) {
			this();
			this.nome = nome;
			this.descricao = descricao;
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


}
