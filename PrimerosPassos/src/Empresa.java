public class Empresa {
	private Funcionario[] empregados;
	private String cnpj;
	private int livre = 0;

	
	public Empresa(int tamanhoArray){
		this.empregados[livre] = empregados[tamanhoArray];
	}
	void adiciona(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}



	void mostraEmpregados() {
		for (int i = 0; i < this.livre; i++) {
			System.out.println("Funcionário na posição: " + i);
			System.out.println("R$" + this.empregados[i].getSalario());
		}
	}
	void mostraTodasAsInformacoes(){
		for (int i = 0; i < this.livre; i++) {
			 if (this.empregados[i] == null) continue;
            System.out.println("Funcionário na posição: " + i);

			this.empregados[i].mostra();
		}	
	}
	
    boolean contem(Funcionario f) {
        for (int i = 0; i < this.livre; i++) {
            if (f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }
    
	
	public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }
	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
