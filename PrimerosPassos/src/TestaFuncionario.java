class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);
        f1.setDataEntradaNoBanco(new Data(2012,11,12));
        f1.getDataEntradaNoBanco().preencheData(1,7,2009);
        f1.mostra();
    }
}