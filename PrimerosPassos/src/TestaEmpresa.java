
        class TestaEmpresa {

            public static void main (String[] args) {
                Empresa empresa = new Empresa(3);
                empresa.setEmpregados(new Funcionario[10]);

                Funcionario f1 = new Funcionario();
                f1.setSalario(1000);
                empresa.adiciona(f1);

                Funcionario f2 = new Funcionario();
                f2.setSalario(1700);
                empresa.adiciona(f2);
                
                Funcionario f3 = new Funcionario();
                f3.setSalario(1000);
                empresa.adiciona(f3);
                
                
                empresa.contem(f3);
                empresa.mostraEmpregados();
//                empresa.mostraTodasAsInformacoes();
                

            }

        }