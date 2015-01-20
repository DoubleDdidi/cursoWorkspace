package interfaces;

public class Círculo implements AreaCalculavel{
private double raio;

public Círculo(double raio){
	this.raio=raio;
}
public double calculaArea() {
	return Math.PI*this.raio*this.raio;
}

}
