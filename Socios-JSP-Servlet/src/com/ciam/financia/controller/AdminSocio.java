package com.ciam.financia.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciam.financia.dao.SocioDAO;
import com.ciam.financia.model.Socio;



/**
 * Servlet implementation class AdminSocio
 */
@WebServlet("/adminSocio")
public class AdminSocio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SocioDAO socioDAO;

	public void init() {
//		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
//		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
//		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		String jdbcURL = "jdbc:mysql://localhost:3306/javaweb_financia";
		String jdbcUsername = "financiaUser";
		String jdbcPassword = "financia123";
		try {

			socioDAO = new SocioDAO(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminSocio() {
		super();
		//*****************************************************************
		init(); //   COMENTADO POR VERIFICACION DE DOBLE INGRESO AL METODO
		//*****************************************************************
		//*****************************************************************
		//*****************************************************************
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola Servlet Socios..");
		String action = request.getParameter("action");
		
		System.out.println(action);
		try {
			switch (action) {
			case "index":
				index(request, response);
				break;
			
			case "cotizar":
				String monto = request.getParameter("montoPedido");
				cotizar(request, response);
				break;
			
			default:
				break;
			}			
		} catch (SQLException e) {
			e.getStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola Servlet Post..");
		doGet(request, response);
	}
	
	private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		//mostrar(request, response);
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void cotizar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/cotizacion.jsp");
		List<Socio> listaSocios= socioDAO.listarSocios();
		request.setAttribute("lista", listaSocios);
		System.out.println(request.getParameter("monto"));
		dispatcher.forward(request, response);
	}	
	
	
}
