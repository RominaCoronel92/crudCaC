package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JugadoresDAOimpl;
import dto.JugadoresDTO;

@WebServlet("/BuscarController")
public class BuscarController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String dni = req.getParameter("dni");
		JugadoresDAOimpl dao = new JugadoresDAOimpl();

		List<JugadoresDTO> listado = dao.buscarDni(Integer.parseInt(dni));
		req.setAttribute("listado", listado);
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}