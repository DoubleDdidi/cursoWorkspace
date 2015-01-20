public class Funcionario {
	private String nome;
	private String departamento;
	private Data dataEntradaNoBanco;
	private double salario;
	public static int identificador =1;

	public Funcionario(String nome){
		this.nome=nome;
		Funcionario.identificador = getIdentificador();
	}
	
	public Funcionario( ){
	}
	
	public static int getIdentificador() {
		return Funcionario.identificador++;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada no banco: " + this.dataEntradaNoBanco.toString());
        System.out.println("Data de entrada: " + this.dataEntradaNoBanco.getFormatada());
        System.out.println("O salario anual: " + this.calculaGanhoAnual());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntradaNoBanco() {
		return dataEntradaNoBanco;
	}

	public void setDataEntradaNoBanco(Data dataEntradaNoBanco) {
		this.dataEntradaNoBanco = dataEntradaNoBanco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
