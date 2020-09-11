package com.viewnext.main.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Libros")
public class Libros {

	@Id
	private int id;

	
	private String nombreLibro;
	private String genero;

	@OneToOne
	private Autores autorLibro;

}
