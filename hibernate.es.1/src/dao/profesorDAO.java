package dao;

import java.util.List;

import modelo.Profesor;

public interface profesorDAO {

	void  insert(Profesor e);
	 public Profesor findById(int id);
	boolean delete(int id);
	boolean update(Profesor e);
	List<Profesor> listAll();
}
