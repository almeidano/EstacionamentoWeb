package br.com.trainning.estacionamento.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public class VeiculoDO implements Serializable, Comparable<VeiculoDO>, Comparator<VeiculoDO> {

	private int id;
	private String placa;
	private String modelo;
	private Date data;
	private String cor;

	public VeiculoDO() {
		// TODO Auto-generated constructor stub
	}

	public VeiculoDO(int id, String placa, String modelo, Date data, String cor) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.data = data;
		this.cor = cor;
	}

	public VeiculoDO(String placa, String modelo, Date dataHora, String cor) {
		
		this.placa = placa;
		this.modelo = modelo;
		this.data = dataHora;
		this.cor = cor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	

	/**
	 * @return the dataHora
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param string the dataHora to set
	 */
	public void setData(Date string) {
		this.data = string;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		VeiculoDO other = (VeiculoDO) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public int compare(VeiculoDO o1, VeiculoDO o2) {
		return o1.getPlaca().compareTo(o2.getPlaca());

	}

	@Override
	public int compareTo(VeiculoDO o) {
		return o.getPlaca().compareTo(getPlaca());
	}

	@Override
	public String toString() {
		return "VeiculoDO [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", data=" + data + ", cor="
				+ cor + "]";
	}

	
}
