package org.action.alta;

import org.dao.reportecap.DAOReporte;
import org.modelo.reporte.Reporte;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionAlta extends ActionSupport implements ModelDriven<Reporte> {

	private Reporte reporte = new Reporte();
	private DAOReporte daoReporte = new DAOReporte();

	public String execute() {
		return SUCCESS;
	}
	
	public String AddReportecap() {
		daoReporte.AddReportecap(reporte);
		return SUCCESS;
	}
	
	@Override
	public Reporte getModel() {
		return reporte;
	}
}
