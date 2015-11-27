package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import dominio.oSessionFactory;
import modelo.Direccion;

public class direccionMysqlDao implements DireccionDAO {
	
	@Override
	public void insertar(Direccion e) {
		// TODO Auto-generated method stub
		try{Session session = oSessionFactory.getSession();
		Transaction tst = session.beginTransaction();
	
		try {
		session.save(e);
		tst.commit();
			
		} catch (HibernateException e2) {
			tst.rollback();
			System.out.println("save failed"+e2);
			
			
			// TODO: handle exception
		}
		session.close();
		//return 0;
	}catch(RuntimeException e3){
		throw e3;
		}
	}

	@Override
	public Direccion findById(int id) {
		Session session = oSessionFactory.getSession();
		Direccion direccion = (Direccion)session.get(Direccion.class, id);
		return direccion;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Direccion e) {
		// TODO Auto-generated method stub
		return false;
	}

}
