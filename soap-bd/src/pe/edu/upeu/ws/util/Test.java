package pe.edu.upeu.ws.util;

import pe.edu.upeu.ws.daoImp.ClienteDaoImp;

public class Test {
	public static void main(String[] args) {
		if(Conexion.getConexion()!=null) {
			System.out.println("conectado");
		}else {
			System.out.println("Error");
		}
		ClienteDaoImp cliente =  new ClienteDaoImp();
		System.out.println(cliente.readVenta("2021-05-04", "2021-05-10", 1).getNombres());
		System.out.println(cliente.readVenta("2021-05-04", "2021-05-10", 1).getApellidos());
		System.out.println(cliente.readVenta("2021-05-04", "2021-05-10", 1).getDireccion());
	
	}
}
