package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}
//lista sem banco de dados e trabalhado na mão
@RestController
@RequestMapping("/icecream")
@CrossOrigin(origins = "*")
class RestApiDemoController {
	private List<Icecream> icecreams = new ArrayList<>();
	private List<Icecream> icepreco = new ArrayList<>();
	
	public RestApiDemoController() {

		icecreams.addAll(List.of(
				new Icecream("Morango", "Kibon", "Casquinha","9,50"),
				new Icecream("Chocolate","Galak", "Pote", "12,50"),
				new Icecream("Menta", "Hershey's", "Baldão","73,95"),
				new Icecream("Limão","Parmalat", "Casquinha", "6,45")
		));

		icepreco.addAll(List.of(
			new Icecream("Menta", "Hershey's", "Baldão","73,95"),
			new Icecream("Chocolate","Galak", "Pote", "12,50"),
			new Icecream("Morango", "Kibon", "Casquinha","9,50"),
			new Icecream("Limão","Parmalat", "Casquinha", "6,45")
		));
	}


	@GetMapping
	Iterable<Icecream> getIcecreams() {
		return icecreams;
	}

	@GetMapping("/preco")
	@CrossOrigin(origins = "*")
	Iterable<Icecream> getPrecos() {
		return icepreco;
	}
//METODO POST PARA CADASTRO - JSON
	@PostMapping
	Icecream postIcecream(@RequestBody String info) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Icecream icecream = mapper.readValue(info, Icecream.class);
			icecreams.add(icecream);
			return icecream;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Icecream icecreamsample = new Icecream();
		return icecreamsample;
	}

	// @GetMapping("/{tipo}")
	// @CrossOrigin(origins = "*")
	// Iterable<Icecream> getTipo() {
	// 	return icecreams;
	// }

	// @GetMapping("/{sabor}")
	// Optional<Icecream> getIcecreamById(@PathVariable String sabor) {
	// 	for (Icecream c: icecreams) {
	// 		if (c.getSabor().equals(sabor)) {
	// 			return Optional.of(c);
	// 		}
	// 	}

	// 	return Optional.empty();
	// }

	

	// @PutMapping("/{sabor}")
	// ResponseEntity<Icecream> putIcecream(@PathVariable String sabor,
	// 								 @RequestBody Icecream icecream) {
	// 	int icecreamIndex = -1;

	// 	for (Icecream c: icecreams) {
	// 		if (c.getSabor().equals(sabor)) {
	// 			icecreamIndex = icecreams.indexOf(c);
	// 			icecreams.set(icecreamIndex, icecream);
	// 		}
	// 	}

	// 	return (icecreamIndex == -1) ?
	// 			new ResponseEntity<>(postIcecream(icecream), HttpStatus.CREATED) :
	// 			new ResponseEntity<>(icecream, HttpStatus.OK);
	// }

	@DeleteMapping("/{sabor}")
	void deleteIcecream(@PathVariable String sabor) {
		icecreams.removeIf(c -> c.getSabor().equals(sabor));
	}
}

// Classe do sorvete: 
class Icecream {
	private String sabor;
	private String marca;
	private String tipo;
	private String preco;

	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPreco(){
		return preco;
	}

	public void setPreco() {
		this.preco = preco;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

//construtor
	public Icecream(String sabor, String marca, String tipo, String preco) {
		this.sabor = sabor;
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;
	}

	public Icecream(){

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



}