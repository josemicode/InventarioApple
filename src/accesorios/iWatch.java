package accesorios;

import java.util.List;

public class iWatch extends complemento{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4206793671532705878L;

	public iWatch(String modelo, double precio, List<String> compIds) {
		super(compIds, modelo, precio);
	}
	
}
