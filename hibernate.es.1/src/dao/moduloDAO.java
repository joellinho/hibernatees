package dao;

import modelo.Modulo;

public interface  moduloDAO {
public void insertar(Modulo e);
public Modulo findById(int id);
boolean delete(int id);
boolean upadate(Modulo e);

}
