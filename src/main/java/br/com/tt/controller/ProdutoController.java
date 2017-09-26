package br.com.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tt.model.Cliente;

@Controller
public class ProdutoController {
	
	@GetMapping("/produto") // endereco da pagina
	public String inicio() {
		System.out.println("Passando pelo Produto...");
		return "produto"; // nome do html
	}

	@GetMapping("/produto-cadastro")
	public String adiciona() {
		System.out.println("Passando pelo Produto...");
		return "produtoCadastro"; // nome do html
	}
	
	@GetMapping("/api/cliente")
	@ResponseBody
	public Cliente clienteServico() {
		Cliente cliente = new Cliente();
		cliente.setNome("Nome do Cliente");
		cliente.setCpf("12312312345");
		cliente.setTexto("Algum Texto");
		
		return cliente;
	}

}
