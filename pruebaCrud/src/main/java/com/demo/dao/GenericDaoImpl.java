package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.demo.configuracion.HibernateUtil;

@Component
public class GenericDaoImpl implements InterfaceGenericDao{

	@Override
	public void genericSave(Object obj) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(obj);
			transaction.commit();
			System.out.println("Saved Successfuly");
//			return "Saved Successfuly";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Saving");
//			return "Error Saving";
		}
		
	}
	
	/*
	 
	 	@Override
	public void genericSave(Object obj) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(obj);
			transaction.commit();
//			return obj;
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
//			return null;
		}
	}
	 
	 
	 */
	 

}
