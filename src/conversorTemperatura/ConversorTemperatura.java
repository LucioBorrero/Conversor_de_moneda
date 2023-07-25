package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
   //      funcion tipo double que si devuelve valor
	public double ConvertirCelciusAFarenheit(double valor) {      //toma parametro tipo valor 
		double farenheit = valor * 1.8 + 32;                      //realiza la conversion
		farenheit = (double) Math.round(farenheit * 100d)/100;    //rendondea decimales
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit "); //lanza ventana emergente
		return farenheit;                                                                                     //la funcion devuelve el valor de la temperatura en grados farenheit
	}
	//     funcion que no devuelve valor al ser tipo void
	public void ConvertirCelciusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin ");
	}
	
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = (double) Math.round(celcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+  " Celcius ");
	}
	
	public double ConvertirKelvinACelcius(double valor) {
		double kelvincelcius = valor - 273.15;
		kelvincelcius = (double) Math.round(kelvincelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Gados Kelvin son " +kelvincelcius+ " Celcius " );
		return kelvincelcius;
	} //esta función toma una temperatura en grados Kelvin, la convierte en grados Celsius, y luego convierte los Celsius a grados Fahrenheit, mostrando el resultado en una ventana emergente. Es un proceso de doble conversión de temperatura.
	public void ConvertirKelvinAFarenheit(double valor) { 
		double kelvinfarenheit = ConvertirKelvinACelcius (valor); //función llamada ConvertirKelvinACelcius pasando valor como argumento. La función ConvertirKelvinACelcius se encarga de convertir la temperatura en grados Kelvin a grados Celsius y devuelve el valor resultante. Ese valor se almacena en la variable kelvinfarenheit.
		kelvinfarenheit = ConvertirCelciusAFarenheit(kelvinfarenheit); //función llamada ConvertirCelciusAFarenheit pasando kelvinfarenheit como argumento. La función ConvertirCelciusAFarenheit toma la temperatura en grados Celsius (que había sido previamente convertida desde Kelvin) y la convierte en grados Fahrenheit. El resultado se almacena nuevamente en la variable kelvinfarenheit
		kelvinfarenheit = (double) Math.round(kelvinfarenheit * 100d) / 100; //redondeo
		JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinfarenheit+ " Celcius "); //La ventana emergente contendrá el valor original en grados Kelvin (valor) y el valor resultante en grados Fahrenheit (kelvinfarenheit) después de realizar la doble conversión de Kelvin a Celsius y luego de Celsius a Fahrenheit.
	}
	
}
