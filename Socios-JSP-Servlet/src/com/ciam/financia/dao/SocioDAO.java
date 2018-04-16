package com.ciam.financia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ciam.financia.model.Conexion;
import com.ciam.financia.model.Socio;



/*
 * @autor: Elivar Largo
 * @web: www.ecodeup.com
 */

public class SocioDAO {
	private Conexion con;
	private Connection connection;

	public SocioDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	
	// listar todos los productos
	public List<Socio> listarSocios() throws SQLException {

		List<Socio> listaSocios = new ArrayList<Socio>();
		String sql = "SELECT * FROM socios";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);
		System.out.println("listaSociosEnDAOsocios..");

		while (resulSet.next()) {
			int id = resulSet.getInt("id");
			String nombre = resulSet.getString("nombre");
			Double tasa = resulSet.getDouble("tasa");
			int montoMaximo = resulSet.getInt("monto_maximo");
			
			Socio socio = new Socio(id, nombre, tasa, montoMaximo);
			listaSocios.add(socio);
		}
		con.desconectar();
		System.out.println("FIN DE LA LISTA");
		return listaSocios;
	}

	// obtener por id
	public Socio obtenerPorId(int id) throws SQLException {
		Socio socio = null;

		String sql = "SELECT * FROM socios WHERE id= ? ";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet res = statement.executeQuery();
		if (res.next()) {
			socio = new Socio(res.getInt("id"), res.getString("nombre"), res.getDouble("tasa"),
					res.getInt("monto_maximo"));
		}
		res.close();
		con.desconectar();

		return socio;
	}

	
	

}
