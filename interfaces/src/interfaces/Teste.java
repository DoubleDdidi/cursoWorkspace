package interfaces;

public class  Teste {    
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        AreaCalculavel b = new C�rculo(3);

        System.out.println(a.calculaArea());
        System.out.println(b.calculaArea());

    }
}
