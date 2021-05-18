package pe.edu.upeu.ws.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.ws.entity.Cliente;

@WebService
public interface ClienteDao {
	@WebMethod
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id);



}