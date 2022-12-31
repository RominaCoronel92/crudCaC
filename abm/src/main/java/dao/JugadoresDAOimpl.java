package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import conexion.conexionBD;
import dto.JugadoresDTO;

public class JugadoresDAOimpl implements JugadoresDAO {

	private static JugadoresDAOimpl instance = null;

	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;

	@Override
	public List<JugadoresDTO> listar() {
		String sql = "SELECT * FROM Jugadores ";
		connection = conexionBD.openConnection();
		List<JugadoresDTO> list = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int idJugadores = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int dni = rs.getInt(4);
				String domicilio = rs.getString(5);
				int telefono = rs.getInt(6);
				int idCategoria = rs.getInt(7);

				JugadoresDTO jugador = new JugadoresDTO(idJugadores, nombre, apellido, dni, domicilio, telefono,
						idCategoria);

				list.add(jugador);
			}

		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public void guardar(String nombre, String apellido, int dni, String domicilio, int telefono, int idCategoria) {

		connection = conexionBD.openConnection();

		if (connection != null) {
			// insert en la db > SQL: INSERT INTO....
			String sql = "INSERT INTO jugadores(nombre,apellido,dni,domicilio,telefono, idCategoria) ";
			sql += "VALUES('" + nombre + "','" + apellido + "','" + dni + "','" + domicilio + "','" + telefono + "','"
					+ idCategoria + "')";

			// control de errores
			try {
				Statement st = connection.createStatement();
				st.execute(sql);

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	@Override
	public List<JugadoresDTO> buscarDni(int dni) {
		String sql = "SELECT * FROM jugadores WHERE dni LIKE '%" + dni + "%' ";

		// Connection
		connection = conexionBD.openConnection();

		List<JugadoresDTO> listado = new ArrayList<JugadoresDTO>();
		// Statement
		try {
			Statement st = connection.createStatement();

			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				int idJugadores = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int Dni = rs.getInt(4);
				String domicilio = rs.getString(5);
				int telefono = rs.getInt(6);
				int idCategoria = rs.getInt(7);

				JugadoresDTO jugador = new JugadoresDTO(idJugadores, nombre, apellido, Dni, domicilio, telefono,
						idCategoria);

				listado.add(jugador);
			}
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}

		return listado;

	}

	@Override
	public void delete(int idJugadores) {
		try {
			String sql = "DELETE FROM jugadores where idJugadores=" + idJugadores;
			connection = conexionBD.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int idJugadores, int telefono, int idCategoria) {
		connection = conexionBD.openConnection();
		if (connection != null) {
			String sql = "UPDATE JUGADORES " + " set telefono= '" + telefono + "'," + " idCategoria='" + idCategoria
					+ "'" + " WHERE idJugadores = '" + idJugadores + "'";

			try {
				Statement st = connection.createStatement();
				st.executeUpdate(sql);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static JugadoresDAOimpl getInstance() {
		instance = Optional.ofNullable(instance).orElse(new JugadoresDAOimpl());
		return instance;
	}

	@Override
	public JugadoresDTO buscar(int idJugadores) {
		JugadoresDTO jugadores = null;
		try {
			jugadores = new JugadoresDTO();
			String sql = "SELECT * FROM jugadores where idJugadores=" + idJugadores;
			connection = conexionBD.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				jugadores.setIdJugadores(resultSet.getInt("idJugadores"));
				jugadores.setNombre(resultSet.getString("nombre"));
				jugadores.setApellido(resultSet.getString("apellido"));
				jugadores.setDni(resultSet.getInt("dni"));
				jugadores.setDomicilio(resultSet.getString("domicilio"));
				jugadores.setTelefono(resultSet.getInt("telefono"));
				jugadores.setIdCategoria(resultSet.getInt("idCategoria"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugadores;
	}

}

