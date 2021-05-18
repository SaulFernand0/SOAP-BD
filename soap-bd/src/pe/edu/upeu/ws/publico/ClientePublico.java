package pe.edu.upeu.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.ws.daoImp.ClienteDaoImp;
public class ClientePublico {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:6061/soap/cliente", new ClienteDaoImp());;
		System.out.println("Ejecutando...");
	}
}
