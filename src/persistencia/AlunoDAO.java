package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import entidade.Aluno;


public class AlunoDAO extends ConnectionDAO {

	private Connection conn;
	
	public AlunoDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexão: " + e.getMessage());
		}
	}
	
	
	//método reponsável por salvar o aluno no banco de dados
	public void save(Aluno a) throws SQLException{
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("insert into aluno values(null,?,?,?,?,?)");
			stmt.setInt(1, a.getMatricula());
			stmt.setString(2, a.getNome());
			stmt.setString(3, a.getEmail());
			stmt.setDouble(4, a.getNota01());
			stmt.setDouble(5, a.getNota02());
			
			int flag = stmt.executeUpdate();
			if (flag == 0)
				throw new SQLException("Erro ao gravar no banco");
		}finally {
			if(conn != null)
				conn.close();
			if(stmt != null)
				stmt.close();
		}
	}
	
	
	//método reponsável por editar os dados os alunos no BD
	public void editRegistro(Aluno a) throws SQLException{
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("update aluno set nome = ?, email = ? where id = ?");
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getEmail());
			stmt.setDouble(3, a.getId());
			
			int flag = stmt.executeUpdate();
			if (flag == 0)
				throw new SQLException("Erro ao editar os dados do aluno");
		}finally {
			if(conn != null)
				conn.close();
			if(stmt != null)
				stmt.close();
		}
	}
	
	
	//método responsável por excluir os alunos do BD
	public void deleteRegistro(Long id) throws SQLException{
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("delete from aluno where id = ?");
			stmt.setDouble(1, id);
			int flag = stmt.executeUpdate();
			if (flag==0)
				throw new SQLException("Erro ao excluir os dados do aluno");	
		}finally {
		if(conn != null)
			conn.close();
		if(stmt != null)
			stmt.close();
	}
	}
	
	
	
	
	
	private Aluno createAluno(ResultSet rs) throws SQLException{
	 	Aluno alu = new Aluno(); 
	 	alu.setId(rs.getLong(1));
		alu.setMatricula(rs.getInt(2));
		alu.setNome(rs.getString(3));
		alu.setEmail(rs.getString(4));
		alu.setNota01(rs.getDouble(5));
		alu.setNota02(rs.getDouble(6));
		
		return alu;		        

	}

	public Aluno getAlunoBymatricula(Integer matricula) throws SQLException{
		
		PreparedStatement stmt = null;
		Aluno aluno = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement("select * from aluno where matricula = ?");
			stmt.setInt(1, matricula);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				aluno = createAluno(rs);
			}
		} finally {
			if(conn != null)
				conn.close();
			if(stmt != null)
				stmt.close();
		}
		
		return aluno;
	}
	
}
	

