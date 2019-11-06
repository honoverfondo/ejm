package mz.gov.misau.DAO;

import org.hibernate.Session;


import mz.gov.misau.entity.Provincia;

public class ProvinciaDAO {
	public int save(Provincia provincia) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(provincia);
		session.getTransaction().commit();
		session.close();
		return provincia.getId();
	}
	
	public void update(Provincia provincia) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(provincia);
		session.getTransaction().commit();
		session.close();
	}
	
	public void 
}
