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

/**
 * Servlet implementation class ListaController
 */
@WebServlet("/lista")
public class ListaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		JugadoresDAOimpl dao = new JugadoresDAOimpl();

		List<JugadoresDTO> listado = dao.listar();

		request.setAttribute("listado", listado);

		getServletContext().getRequestDispatcher("/listado.jsp").forward(request, response);
	}

}
