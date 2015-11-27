package dominio;

import java.io.Serializable;

import modelo.Profesor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class oSessionFactory  {
	
	
	public static Session getSession() {
		SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session=sessionFactory.openSession();
        //Profesor profesor=(Profesor)session.get(Profesor.class,id);
        return session;
	//return session;

	
	
	}
}
