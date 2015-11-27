package dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dominio.oSessionFactory;
import modelo.Modulo;

public class moduloMysqlDao implements moduloDAO {

	@Override
	public void insertar(Modulo e) {
		try {
			Session session = oSessionFactory.getSession();
			Transaction tst = session.beginTransaction();
			try {
				session.save(e);
				tst.commit();
			} catch (HibernateException e2) {
				System.out.println("error save"+e2.getMessage());
				tst.rollback();
			}
			session.close();
		} catch (Exception e2) {
			throw e2;
		}
		
		

	}

	@Override
	public Modulo findById(int id) {
		Session session = oSessionFactory.getSession();
		Modulo modulo = (Modulo)session.get(Modulo.class, id);
		return modulo;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upadate(Modulo e) {
		// TODO Auto-generated method stub
		return false;
	}



}
