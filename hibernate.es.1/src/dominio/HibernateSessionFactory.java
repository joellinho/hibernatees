package dominio;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateSessionFactory {
/*private static String  CONFIG_FILE_LOCATION="/hibernate.cfg.xml";	
private static final ThreadLocal<Session> threadLocal=new ThreadLocal<>();
private static Configuration configuration = new Configuration();
private static SessionFactory sessionFactory;
private static String configFile= CONFIG_FILE_LOCATION;

*///metodo 2
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();	
	private static SessionFactory sessionFactory;
	
	//ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySetting(configuration2.getProperties()). 
	
	


static{
	try {

    Configuration configuration = new Configuration();
    configuration.configure();
    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	} catch (Exception e) {
		System.err
		.println("error creating Session on hibernateSessionFactoryclass");
		e.printStackTrace();
		// TODO: handle exception
	}
	
}
/*public static void rebuildSessionFactory() {
	try {
		configuration.configure(configFile);
		sessionFactory = configuration.buildSessionFactory();
	} catch (Exception e) {
		System.err
				.println("%%%% Error Creating SessionFactory %%%%");
		e.printStackTrace();
	}}
*/

private HibernateSessionFactory(){}

public static Session getSession()throws HibernateException{
	Session session =(Session) threadLocal.get();
	sessionFactory.openSession();
	threadLocal.set(session);
	
	
	return session;
}

/*public static void closeSession() throws HibernateException {
    Session session = (Session) threadLocal.get();
    threadLocal.set(null);

    if (session != null) {
        session.close();
    }
}*/
}


