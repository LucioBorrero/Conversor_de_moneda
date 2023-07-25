package conversorTemperatura;

import javax.swing.JOptionPane;

public class funcionesTemperatura {
    //instancia           variable                  clase
	ConversorTemperatura temperatura = new ConversorTemperatura();
	//metodo que muestra ventaja con pestañas desplegables con las opciones para convertir temperatura
	public void ConversorTemperatura (double Minput) { //                                                    despliga las opciones                               aqui inician las opciones
		String opcion = (JOptionPane.showInputDialog(null, "Elige una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit"}, "Seleccion")).toString();
		switch(opcion){ //switch se utiliza para ejecutar la conversión de temperatura adecuada según la opción seleccionada por el usuario en la ventana emergente.
		case "Grados Celcius a Grados Farenheit":
			temperatura.ConvertirCelciusAFarenheit(Minput);
			break;
		case "Grados Celcius a Kelvin":
			temperatura.ConvertirCelciusAKelvin(Minput);
			break;
		case "Grados Farenheit a Grados Celcius":
			temperatura.ConvertirFarenheitACelcius(Minput);
			break;
		case "Kelvin a Grados Celcius":
			temperatura.ConvertirKelvinACelcius(Minput);
			break;
		case "Kelvin a Grados Farenheit":
			temperatura.ConvertirKelvinAFarenheit(Minput);
			break;
		}
	}
}
