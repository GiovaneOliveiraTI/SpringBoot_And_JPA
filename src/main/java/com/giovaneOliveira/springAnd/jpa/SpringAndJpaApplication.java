package com.giovaneOliveira.springAnd.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.giovaneOliveira.springAnd.jpa.model.Categoria;
import com.giovaneOliveira.springAnd.jpa.model.Cidade;
import com.giovaneOliveira.springAnd.jpa.model.Cliente;
import com.giovaneOliveira.springAnd.jpa.model.Endereco;
import com.giovaneOliveira.springAnd.jpa.model.Estado;
import com.giovaneOliveira.springAnd.jpa.model.Produto;
import com.giovaneOliveira.springAnd.jpa.model.enums.TipoCliente;
import com.giovaneOliveira.springAnd.jpa.repositories.CategoriaRepository;
import com.giovaneOliveira.springAnd.jpa.repositories.CidadeRepository;
import com.giovaneOliveira.springAnd.jpa.repositories.ClienteRepository;
import com.giovaneOliveira.springAnd.jpa.repositories.EnderecoRepository;
import com.giovaneOliveira.springAnd.jpa.repositories.EstadoRepository;
import com.giovaneOliveira.springAnd.jpa.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringAndJpaApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired	
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAndJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado estado1 = new Estado(null, "Minas Gerais ");
		Estado estado2 = new Estado(null, "São Paulo ");
		
		Cidade cidade1 = new Cidade (null, "Uberlândia", estado1);
		Cidade cidade2 = new Cidade (null, "São Paulo", estado2);
		Cidade cidade3 = new Cidade (null, "Campinas", estado2);
		
		estado1.getCidades().addAll((Arrays.asList(cidade1)));
		estado2.getCidades().addAll((Arrays.asList(cidade2, cidade3)));
		
		estadoRepository.saveAll(Arrays.asList(estado1, estado2));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));
		
		Cliente cliente01 = new Cliente(null,"José Sei la das Quantas", "joseseiladasquantas@gmail.com","2143245640",TipoCliente.PESSOAFISICA );
		cliente01.getTelefones().addAll(Arrays.asList("89798798798798", "8778687689"));
		
		Endereco endereco01 = new Endereco(null, "Rua José Gomes Viana", "300", "apt 3030", "Jardim 04", "32242", cliente01,cidade1); 
		Endereco endereco02 = new Endereco(null, "Avenida 32", "103", "3022", "Centro", "2435354353", cliente01, cidade2);
		
		cliente01.getEnderecos().addAll(Arrays.asList(endereco01, endereco02));
		
		clienteRepository.saveAll(Arrays.asList(cliente01));
		
		enderecoRepository.saveAll(Arrays.asList(endereco01, endereco02));
			
	}
}
