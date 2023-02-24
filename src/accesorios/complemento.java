package accesorios;

import java.io.Serializable;
import java.util.List;

public abstract class complemento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -891977769935302837L;
	protected List<String> compIds;
	protected String modelo;
	protected double precio;

	public complemento(List<String> compIds, String modelo, double precio) {
		super();
		this.compIds = compIds;
		this.modelo = modelo;
		this.precio = precio;
	}


	public List<String> getCompIds() {
		return compIds;
	}

	public void setCompIds(List<String> compIds) {
		this.compIds = compIds;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return modelo + ": por tan solo " + precio + "$";
	}
	
	
	
	

}
