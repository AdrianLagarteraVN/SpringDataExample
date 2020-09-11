package com.viewnext.main.data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Anotacion que nos indica que esta clase es una entidad. 
@Entity
//Anotacion encargada de referenciar el nombre de la tabla, si no se indicara nombre se cogeria el de la clase 
@Table(name = "autores")
public class Autores {

	/*
	 * Etiqueta encargada de indicar cual es la id primaria, en cuyo caso de que sea
	 * una id compuesta por muchos campos tendriamos dos opciones crear una clase
	 * que sea la key y embeberla, o definir el modelo de la clase, e introducirlo
	 * con la anotacion idclass y asignar la etiqueta id a cada uno de los campos
	 */
	@Id
	private int idAutor;

	private String nombreAutor;
	private String edad;

	@OneToMany
	private Libros librosCreados;

	@OneToOne
	private Editoriales editorial;
}
