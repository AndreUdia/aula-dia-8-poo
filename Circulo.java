public class Circulo {
	double raio;
	double pi = 3.14;
	
	public Double retornaArea() {
		return 2*pi*raio;
	}
	
	public Double retornaCircunferencia(Double diam) {
		return raio*diam;
	}
}
