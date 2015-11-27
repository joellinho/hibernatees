package dao;

import modelo.Direccion;

public interface DireccionDAO {
	void insertar(Direccion e);

	public Direccion findById(int id);

	boolean delete(int id);

	boolean update(Direccion e);
}
