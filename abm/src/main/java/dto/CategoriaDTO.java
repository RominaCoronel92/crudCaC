package dto;

public class CategoriaDTO {

	private int idCategoria;
	private String entrenador;
	private int año;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(int idCategoria, String entrenador, int año) {
		super();
		this.idCategoria = idCategoria;
		this.entrenador = entrenador;
		this.año = año;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "CategoriaDTO [idCategoria=" + idCategoria + ", entrenador=" + entrenador + ", año=" + año + "]";
	}

}
