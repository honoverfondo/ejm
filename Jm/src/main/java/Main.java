import mz.gov.misau.DAO.ProvinciaDAO;
import mz.gov.misau.entity.Provincia;

public class Main {
	public static void main(String[] args) {
		Provincia p = new Provincia("Maputo");
		ProvinciaDAO dao = new ProvinciaDAO();
		dao.save(p);
		
		
	}
}
