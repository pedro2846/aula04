package app;

import entidade.Aluno;
import implement.AlunoDAOImp;

public class AppConsulta {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		//chamada de objeto anonimo do AlunoDAOImp
		if(new AlunoDAOImp().salvar(aluno))
			System.out.println();
		else
			System.out.println("Falha na gravação");
	}
	
}
