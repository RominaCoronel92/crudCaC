package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JugadoresDAOimpl;
import dto.JugadoresDTO;

@WebServlet("/EditarController")
public class EditarController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idJugadores = request.getParameter("idJugadores");

		JugadoresDAOimpl dao = new JugadoresDAOimpl();

		JugadoresDTO jugador = dao.buscar(Integer.parseInt(idJugadores));

		request.setAttribute("jugador", jugador);

		getServletContext().getRequestDispatcher("/editar.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// String idJugadores = req.getParameter("idJugadores");
		String idJugadores = req.getParameter("idJugadores");
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String dni = req.getParameter("dni");
		String domicilio = req.getParameter("domicilio");
		String telefono = req.getParameter("telefono");
		String idCategoria = req.getParameter("idCategoria");

		System.out.println(idJugadores);
		// Crear ProductoDAO
		JugadoresDAOimpl dao = new JugadoresDAOimpl();

		// invocar actualizarProducto(params)
		dao.update(Integer.parseInt(idJugadores), Integer.parseInt(telefono), Integer.parseInt(idCategoria));

		// ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath() + "/lista");
	}
}