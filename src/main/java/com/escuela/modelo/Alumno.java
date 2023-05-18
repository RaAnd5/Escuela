package com.escuela.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//declaram os el modelo de datos segun la tabla en la BBDD
//necesitam os constructor por defecto y constructor vacio para clase abstracta

//ahora ponemos las anotaciones necesarioas , donde nos trae 

@Entity
@Table(name = "alumno")
@EntityListeners(AuditingEntityListener.class) 


public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre") 
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "tipoUsuario")
	private Long tipoUsuario;
	
	@Column(name = "activo")
	private boolean activo;
	
	@Column(name = "dni")
	private String dni;

	
	//Inicio del constructor por defecto poniendo todos los parametros de los campos
	
	
	public Alumno(Long id, String nombre, String apellidos, String usuario, String password, String foto, String direccion, String telefono, Long tipoUsuario, boolean activo, String dni) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.password = password;
		this.foto = foto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipoUsuario = tipoUsuario;
		this.activo = activo;
		this.dni = dni;
		
		

	}
	
	
	//fin del constructor por defecto
	
	
	//con esto hacemos la clase abstracta 
	
	


	public Alumno () {
		
	
	}
	
	//fin de la declaracion de abstraccion
	
	
	
	//aqui el string toString
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", usuario=" + usuario
				+ ", password=" + password + ", foto=" + foto + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipoUsuario=" + tipoUsuario + ", activo=" + activo + ", dni=" + dni + "]";
	}

	
	//vamos a darle la magia de los getter y setters desde eclipse con el boton secundario. click dcho codigo, source, generate getters y setters
	
	public Long getId() {
		return id;
	}


	

	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Long getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(Long tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

}
