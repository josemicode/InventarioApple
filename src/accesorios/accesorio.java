package accesorios;

import java.util.List;

public class accesorio extends complemento{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8602606951877444577L;

	public accesorio(String modelo, double precio, List<String> compIds) {
		super(compIds, modelo, precio);
	}

}
