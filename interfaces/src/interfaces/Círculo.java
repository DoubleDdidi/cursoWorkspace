package interfaces;

public class C�rculo implements AreaCalculavel{
private double raio;

public C�rculo(double raio){
	this.raio=raio;
}
public double calculaArea() {
	return Math.PI*this.raio*this.raio;
}

}
