package entidade;
//extendes opera��o de relacionamento Heran�a
//Aulno extends Pessoa � equivalente a Aluno � uma pessoa
public class Aluno extends Pessoa{
	private Long matricula;
	private Double nota01;
	private Double nota02;
	
	//construtor sem argumentos
	public Aluno() {
		
	}
	
	//construtor com argumentos e chamada do construtor da SuperClass
	public Aluno(String nome, String email, String telefone, Long matricula, Double nota01, Double nota02) {
		super(nome,email, telefone);
		this.matricula = matricula;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}
	public String toString() {
		return super.toString() + "\tMatricula: " + matricula + "\tNota01: " + nota01 + "\tNota02: "+ nota02;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}
	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}
	public Long getMatricula() {
		return matricula;
	}
	public Double getNota01() {
		return nota01;
	}
	public Double getNota02() {
		return nota02;
	}
	
}
