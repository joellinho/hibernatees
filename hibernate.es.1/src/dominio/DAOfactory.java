package dominio;


import dao.CorreoElectronicoDAO;
import dao.DireccionDAO;
import dao.moduloDAO;
import dao.profesorDAO;

public abstract class DAOfactory {
  
	public static final int MYSQL=1;
	//public static final int oracle=2;
	
	
	
	public abstract profesorDAO getProfesorDao();
	public abstract DireccionDAO getDireccionDao();
	public abstract CorreoElectronicoDAO getcCorreoElectronicoDao();
	public abstract moduloDAO getModuloDao();
	
	
	
	public static DAOfactory getDaoFactory(int bd){
		switch (bd) {
		case MYSQL:
			System.out.println("creando msqlfactoryDAo");
			return new mysqlfactoryDAO();
		//case oracle:
			
		default:
			return null;
			
		}
		
	}
}
