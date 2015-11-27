package dao;

import modelo.*;
public interface CorreoElectronicoDAO {
 void insert(CorreoElectronico correoElectronico);
 public CorreoElectronico findById(int id);

	boolean delete(int id);

	boolean update(CorreoElectronico e);


}
