package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.*;
import dominio.oSessionFactory;
import modelo.CorreoElectronico;

public class CorreoElectronicoMysqlDao implements CorreoElectronicoDAO {

	@Override
	public void insert(CorreoElectronico correoElectronico) {
	try {Session session = oSessionFactory.getSession();
	Transaction tst = session.beginTransaction();
	
	try {
		session.save(correoElectronico);
		tst.commit();
			
		} catch (HibernateException e2) {
			tst.rollback();
			System.out.println("save failed"+e2);
			
			
			
			// TODO: handle exception
		}
		session.close();
		
	} catch (RuntimeException e) {
		
		throw e;
		
	}	

	}

	@Override
	public CorreoElectronico findById(int id) {
		Session session = oSessionFactory.getSession();
		CorreoElectronico correoElectronico =(CorreoElectronico)session.get(CorreoElectronico.class, id);

		return correoElectronico;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CorreoElectronico e) {
		// TODO Auto-generated method stub
		return false;
	}

}
