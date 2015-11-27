package dominio;

import dao.CorreoElectronicoDAO;
import dao.CorreoElectronicoMysqlDao;
import dao.DireccionDAO;
import dao.direccionMysqlDao;
import dao.moduloDAO;
import dao.moduloMysqlDao;
import dao.profesorDAO;
import dao.profesorMysqlDAO;

public class mysqlfactoryDAO  extends DAOfactory{


	@Override
	public profesorDAO getProfesorDao() {
		// TODO Auto-generated method stub
		
		System.out.println("creando profesor mysqlfactoryDAO");
		return new profesorMysqlDAO();
	}

	@Override
	public DireccionDAO getDireccionDao() {
		
		return new direccionMysqlDao();
	}

	@Override
	public CorreoElectronicoDAO getcCorreoElectronicoDao() {
		// TODO Auto-generated method stub
		return new CorreoElectronicoMysqlDao();
	}

	@Override
	public moduloDAO getModuloDao() {
		
		return new moduloMysqlDao();
	}
	
}
