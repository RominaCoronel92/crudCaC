package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.conexionBD;

@WebServlet("/Eliminar")
public class EliminarController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6946913321715398441L;

	Connection connection = null;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idJugadores = request.getParameter("idJugadores");

		connection = conexionBD.openConnection();

		if (connection != null) {
			String sql = "DELETE FROM JUGADORES WHERE idJugadores=" + idJugadores;

			try {
				Statement st = connection.createStatement();
				st.executeUpdate(sql);

				response.sendRedirect(request.getContextPath() + "/lista");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
