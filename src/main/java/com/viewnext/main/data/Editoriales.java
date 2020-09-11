package com.viewnext.main.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "editorial")
public class Editoriales {
	
	@Id
	private int id;
	
	private String nombreEditorial;
	private String direccion;
	
	@OneToMany
	private Autores autoresMiembro;
	
}
