package dao;

import java.util.List;

import modelo.Profesor;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import dominio.oSessionFactory;

//import dominio.HibernateSessionFactory;


public class profesorMysqlDAO implements profesorDAO {
	//private static final Logger log = LoggerFactory.getLogger(profesorMysqlDAO.class);
	@Override
	public void insert(Profesor e) {
		try{Session session = oSessionFactory.getSession();
		Transaction tst = session.beginTransaction();
	
		try {
		session.save(e);
		tst.commit();
			
		} catch (HibernateException e2) {
			tst.rollback();
			System.out.println("save failed"+e2);
		
		}
		session.close();
		//return 0;
	}catch(RuntimeException e3){
		throw e3;
		}
		
	}
		

	@Override
	public Profesor findById(int id) {
		Session session = oSessionFactory.getSession(); 
			Profesor profesor=	(Profesor)session.get(Profesor.class, id);
				return profesor;
		
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Profesor e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Profesor> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
