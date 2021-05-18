package pe.edu.upeu.ws.cliente;

import pe.edu.upeu.ws.daoImp.ClienteDaoImpService;

public class ClienteService {
	public static void main(String[] args) {
		ClienteDaoImpService pds = new ClienteDaoImpService();
		pe.edu.upeu.ws.daoImp.ClienteDao pd = pds.getClienteDaoImpPort();
		
		System.out.println("Nombre: " + pd.readVenta("2021-05-04", "2021-05-10", 1).getNombres());
		System.out.println("Apellido: " + pd.readVenta("2021-05-04", "2021-05-10", 1).getApellidos());
		System.out.println("DNI: " + pd.readVenta("2021-05-04", "2021-05-10", 1).getDni());
		System.out.println("Dirección: " + pd.readVenta("2021-05-04", "2021-05-10", 1).getDireccion());
		
	}
}
