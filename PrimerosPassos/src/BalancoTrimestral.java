
 class BalancoTrimestral {
        public static void main(String[] args) {
            int gastosJaneiro = 15000;
            int gastosFevereiro = 23000;
            int gastosMarco = 17000;
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

            System.out.println("Gasto do trimestre: R$" + gastosTrimestre);
            int mediaPorMes = gastosTrimestre / 3;
            System.out.println("Média mensal: R$" + mediaPorMes);            }
    
//        int fatorial = 1;
//        for (int n = 1; n <= 10; n++) {
//            fatorial = fatorial * n;
//            System.out.println("fat(" + n + ") = " + fatorial);
//        }
 }