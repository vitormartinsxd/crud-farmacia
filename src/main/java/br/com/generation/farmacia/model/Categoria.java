package br.com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	
	@Entity
	@Table(name = "tb_categorias")
	public class Categoria {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "Remedios é uma informação obrigatória.")
		@Size(min = 3 , max = 255)
		private String remedios;
		
		@NotBlank(message = "Remedios é uma informação obrigatória.")
		@Size(min = 3 , max = 255)
		private String tipos;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRemedios() {
			return remedios;
		}

		public void setRemedios(String remedios) {
			this.remedios = remedios;
		}

		public String getTipos() {
			return tipos;
		}

		public void setTipos(String tipos) {
			this.tipos = tipos;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
		


}
