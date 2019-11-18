package com.bd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "abastecimento")
public class Abastecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String data;
	@Column
	private String placa;
	@Column
	private Long odo;
	@Column
	private String posto;
	@Column(columnDefinition = "decimal")
	private Double litros;
	@Column(name = "preco_pago", columnDefinition = "decimal")
	private Double precoPago;
	@Column(name = "tipo_veiculo")
	private String tipoVeiculo;

	public Abastecimento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Long getOdo() {
		return odo;
	}

	public void setOdo(Long odo) {
		this.odo = odo;
	}

	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public Double getPrecoPago() {
		return precoPago;
	}

	public void setPrecoPago(Double precoPago) {
		this.precoPago = precoPago;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Abastecimento that = (Abastecimento) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(data, that.data) &&
				Objects.equals(placa, that.placa) &&
				Objects.equals(odo, that.odo) &&
				Objects.equals(posto, that.posto) &&
				Objects.equals(litros, that.litros) &&
				Objects.equals(precoPago, that.precoPago) &&
				Objects.equals(tipoVeiculo, that.tipoVeiculo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, data, placa, odo, posto, litros, precoPago, tipoVeiculo);
	}

	@Override
	public String toString() {
		return "Abastecimento{" +
				"id=" + id +
				", data='" + data + '\'' +
				", placa='" + placa + '\'' +
				", odo='" + odo + '\'' +
				", posto='" + posto + '\'' +
				", litros='" + litros + '\'' +
				", precoPago='" + precoPago + '\'' +
				", tipoVeiculo='" + tipoVeiculo + '\'' +
				'}';
	}
}
