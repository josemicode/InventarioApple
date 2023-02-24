package accesorios;

import java.util.List;

public class airPods extends complemento{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3072374203998125395L;

	public airPods(String modelo, double precio, List<String> compIds) {
		super(compIds, modelo, precio);
	}
	
}
