package com.generation.lojadegames.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O nome do Produto é obrigatorio e não pode ser nulo ou conter apenas espaços em branco!")
	@Size(min = 5, max = 100, message = "O nome deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length = 100)
	private String nome;
	
	@NotBlank(message = "A descrição é obrigatoria e não pode ser nula ou conter apenas espaços em branco!")
	@Size(min = 5, max = 500, message = "A descrição deve conter no mínimo 05 e no máximo 500 caracteres")
	@Column(length = 500)
	private String descricao;
	
	@NotBlank(message = "Informar o console é obrigatorio e não pode ser nulo ou conter apenas espaços em branco!")
	@Size(min = 5, max = 200, message = "O console deve conter no mínimo 05 e no máximo 200 caracteres")
	@Column(length = 200)
	private String console;
	
	@NotNull(message = "A quantidade dos produtos não pode ser nula ou conter apenas espaços em branco!")
	@Positive(message = "A quantidade deve ser maior que zero!")
	private int quantidade;
	
	@NotNull(message = "Informe o Preço do Produto!")
	@Positive(message = "O preço do Produto deve ser maior que zero!")
	private float preco;
	
	@NotBlank(message = "Insira uma foto para validação do seu produto")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
