package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.JugadoresDAOimpl;

/**
 * Servlet implementation class ListaController
 */
@WebServlet("/AltaController")
public class AltaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		String domicilio = request.getParameter("domicilio");
		String telefono = request.getParameter("telefono");
		String idCategoria = request.getParameter("idCategoria");

		JugadoresDAOimpl dao = new JugadoresDAOimpl();

		dao.guardar(nombre, apellido, Integer.parseInt(dni), domicilio, Integer.parseInt(telefono),
				Integer.parseInt(idCategoria));

		response.sendRedirect(request.getContextPath() + "/lista");
	}
}