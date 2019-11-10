package mz.gov.misau.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mz.gov.misau.DAO.ProvinciaDAO;
import mz.gov.misau.entity.Provincia;

@ManagedBean(name="MBProvincia")
@ViewScoped
public class ProvinciaBean {
	private Provincia provincia;

	public ProvinciaBean() {
		provincia=new Provincia();
	}
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
	public String insertProvincia() {
		ProvinciaDAO dao=new ProvinciaDAO();
		dao.save(provincia);
		return "";
	}
}
