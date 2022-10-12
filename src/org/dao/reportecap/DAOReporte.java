package org.dao.reportecap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.reporte.Reporte;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DAOReporte {

	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction;
	
	public void AddReportecap(Reporte reporte) {
		try {
			session.save(reporte);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
