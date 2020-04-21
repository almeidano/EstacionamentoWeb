package br.com.trainning.estacionamento.model;

import java.io.Serializable;
import java.util.Comparator;

public class UsuarioDO implements Serializable, Comparable<UsuarioDO>, Comparator<UsuarioDO>{

	private int id;
	private String nome;
	private String email;
	private String username;
	private String password;
	
	
	public UsuarioDO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UsuarioDO(int id, String nome, String email, String username, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDO other = (UsuarioDO) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public int compare(UsuarioDO o1, UsuarioDO o2) {
		
		return o1.getUsername().compareTo(o2.getUsername());
	}

	@Override
	public int compareTo(UsuarioDO o) {
		 
		return o.getUsername().compareTo(getUsername());
	}


	@Override
	public String toString() {
		return "UsuarioDO [id=" + id + ", nome=" + nome + ", email=" + email + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	

}
