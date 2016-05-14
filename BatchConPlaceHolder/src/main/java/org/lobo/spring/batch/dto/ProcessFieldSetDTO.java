package org.lobo.spring.batch.dto;

public class ProcessFieldSetDTO {
	private String salida;

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((salida == null) ? 0 : salida.hashCode());
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
		ProcessFieldSetDTO other = (ProcessFieldSetDTO) obj;
		if (salida == null) {
			if (other.salida != null)
				return false;
		} else if (!salida.equals(other.salida))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProcessFieldSetDTO [salida=" + salida + "]";
	}
	
	
}
