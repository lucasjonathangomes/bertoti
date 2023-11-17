package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/icecream")
@CrossOrigin(origins = "*")
class RestApiDemoController {
	private List<Icecream> icecreams = new ArrayList<>();

	public RestApiDemoController() {
		icecreams.addAll(List.of(
				new Icecream("Morango", "Kibon","9,50"),
				new Icecream("Chocolate","Galak", "12,50"),
				new Icecream("Menta", "Hershey's","73,95"),
				new Icecream("Limão","Parmalat", "6,45")
		));
	}

	@GetMapping
	Iterable<Icecream> getIcecreams() {
		return icecreams;
	}

	@GetMapping("/{preco}")
	@CrossOrigin(origins = "*")
	Iterable<Icecream> getPrecos() {
		return icecreams;
	}

	@GetMapping("/{sabor}")
	Optional<Icecream> getIcecreamById(@PathVariable String sabor) {
		for (Icecream c: icecreams) {
			if (c.getSabor().equals(sabor)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Icecream postIcecream(@RequestBody Icecream icecream) {
		icecreams.add(icecream);
		return icecream;
	}

	@PutMapping("/{sabor}")
	ResponseEntity<Icecream> putIcecream(@PathVariable String sabor,
									 @RequestBody Icecream icecream) {
		int icecreamIndex = -1;

		for (Icecream c: icecreams) {
			if (c.getSabor().equals(sabor)) {
				icecreamIndex = icecreams.indexOf(c);
				icecreams.set(icecreamIndex, icecream);
			}
		}

		return (icecreamIndex == -1) ?
				new ResponseEntity<>(postIcecream(icecream), HttpStatus.CREATED) :
				new ResponseEntity<>(icecream, HttpStatus.OK);
	}

	@DeleteMapping("/{sabor}")
	void deleteIcecream(@PathVariable String sabor) {
		icecreams.removeIf(c -> c.getSabor().equals(sabor));
	}
}

class Icecream {
	private String sabor;
	private String marca;
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

	public Icecream(String sabor, String marca, String preco) {
		this.sabor = sabor;
		this.marca = marca;
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}