package implement;

import java.sql.SQLException;
import persistencia.AlunoDAO;
import entidade.Aluno;

public class AlunoDAOImp {

	
	private AlunoDAO dao = null;
	
	public AlunoDAOImp() {
		dao = new AlunoDAO();
	}
	public Boolean salvar(Aluno a) {
		try {
			dao.save(a);
			return Boolean.TRUE;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}
