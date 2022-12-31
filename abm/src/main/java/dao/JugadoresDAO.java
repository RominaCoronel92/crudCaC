package dao;

import java.util.List;

import dto.JugadoresDTO;

public interface JugadoresDAO {

	// Metodo para listar los jugadores
	public List<JugadoresDTO> listar();

	// Metodo para guardar un jugador nuevo
	public void guardar(String nombre, String apellido, int dni, String domicilio, int telefono, int idCategoria);

	// Metodo para buscar una jugador
	public JugadoresDTO buscar(int idJugadores);

	// Metodo para modificar un jugador
	public void update(int idJugadores, int telefono, int idCategoria);

	// Metodo para eliminar un jugador
	public void delete(int idJugadores);

	public List<JugadoresDTO> buscarDni(int dni);

	}

