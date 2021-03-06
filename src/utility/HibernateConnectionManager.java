package utility;

import javax.security.auth.login.Configuration;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class HibernateConnectionManager {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() throws HibernateException {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		}

		return sessionFactory;
	}

}
