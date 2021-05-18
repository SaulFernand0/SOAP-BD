package pe.edu.upeu.ws.daoImp;

import java.sql.ResultSet;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.PreparedStatement;

import pe.edu.upeu.ws.dao.ClienteDao;
import pe.edu.upeu.ws.entity.Cliente;
import pe.edu.upeu.ws.util.Conexion;
@WebService(endpointInterface = "pe.edu.upeu.ws.dao.ClienteDao")
public class ClienteDaoImp implements ClienteDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	@Override
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id) {
		Cliente client = new Cliente();
		
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("select * from cliente c join venta v on (c.idcliente = v.idcliente) join detalle d on (d.idventa = v.idventa) join producto p on (p.idproducto = d.idproducto) where v.fecha between ? and ? and c.idcliente = ?");
			
			ps.setString(1, fecha_ini);
			ps.setString(2, fecha_fin);
			ps.setInt(3, id);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				
					
					client.setNombres(rs.getString("nombres"));
					client.setApellidos(rs.getString("apellidos"));
					client.setDni(rs.getString("dni"));
					client.setDireccion(rs.getString("direccion"));
					
				
				
			
				
				/*
					String fecha = rs.getString("fecha");
					String nombre = rs.getString("nombre");
					String direccion = rs.getString("direccion");
					String dni = rs.getString("dni");
					String producto = rs.getString("producto");
					String documento = rs.getString("documento");
					String numero = rs.getString("numero");
					String cantidad = rs.getString("cantidad");
					String stock = rs.getString("stock");
					String subtotal = rs.getString("subtotal");
					*/
					
					//reporte.add(new Object[] {fecha, nombre, direccion, dni, producto, documento, numero, cantidad, stock, subtotal});

					
			}
						
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return client;

		
		
	}

}
