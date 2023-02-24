package dispositivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import accesorios.complemento;

public abstract class dispositivo implements Serializable{
	
	/**
	 **/
	
	private static final long serialVersionUID = -4997449946235100712L;
	protected String modelo;
	protected double precio;
	protected String id;
	protected String procesador;
	
	public dispositivo(String modelo, double precio, String id, String procesador) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.id = id;
		this.procesador = procesador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<complemento> compatible(List<complemento> accs) {
		List<complemento> compatibles = new ArrayList<>();
		
		for(int i = 0; i < accs.size(); i++ ) {
			for(int j = 0; j < accs.get(i).getCompIds().size(); j++) {
				String aux = accs.get(i).getCompIds().get(j);
				
				if(aux.equals(this.getId())) {
					compatibles.add(accs.get(i));
				}
			}
		}
		compatibles.sort(Comparator.comparing(complemento::getPrecio));
		Collections.reverse(compatibles);
		
		
		return compatibles;
	}

	@Override
	public String toString() {
		return modelo + ": impulsado por un procesador " + procesador + ", llevatelo por el modico precio de "
				+ precio + "$";
	}
	
	
}
