package com.ciam.financia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ciam.financia.model.Conexion;
import com.ciam.financia.model.Prestamo;
import com.ciam.financia.model.Socio;




public class SocioDAO {
	private Conexion con;
	private Connection connection;

	public SocioDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	
	// listar todos los productos
	public Prestamo calcularPrestamo(int montoPedido) throws SQLException {

		//List<Socio> listaSocios = new ArrayList<Socio>();
		Prestamo prestamo=null;
		String sql = "SELECT * FROM socios WHERE monto_maximo>"+montoPedido + " ORDER BY tasa ASC";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);
		System.out.println("listaSociosEnDAOsocios..");

		if (resulSet.next()) {
			int id = resulSet.getInt("id");
			String nombre = resulSet.getString("nombre");
			Double tasa = resulSet.getDouble("tasa");
			int montoMaximo = resulSet.getInt("monto_maximo");
			
			Socio socio = new Socio(id, nombre, tasa, montoMaximo);
			prestamo=new Prestamo(socio,montoPedido,socio.getTasa());
		} else {System.out.println("NO HAY SOCIO DISPONIBLE");
			//prestamo.setMessage("NO HAY SOCIO DISPONIBLE");
		}
		con.desconectar();
		System.out.println("FIN DE LA LISTA");
		return prestamo;
	}

	

	
	

}
