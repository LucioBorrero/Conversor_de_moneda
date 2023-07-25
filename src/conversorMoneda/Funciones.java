package conversorMoneda;

import javax.swing.JOptionPane;

public class Funciones {
    //clase     objeto creado   utiliza el operador new para crear una nueva instancia (objeto) de la clase ConvertirMoneda
	ConvertirMoneda moneda = new ConvertirMoneda ();
	ConvertirAPesos pesos = new ConvertirAPesos();
	
	//este método muestra una ventana emergente de diálogo con opciones de conversión de moneda y guarda la opción seleccionada por el usuario en la variable opcion, que luego puedes usar para realizar la conversión deseada.
	public void ConvertirMoneda (double Minput) { //Minput es variable tipo double que llama metodo ConvertirMoneda para pasar la cantidad que deseo convertir
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la moneda a la que deseas convertir tu dinero", "Monedas" , 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, 
				"Selección")).toString(); //"Selección": Es el valor predeterminado que aparecerá seleccionado en la ventana emergente de diálogo. toString();: Convierte el resultado de la selección del usuario a una cadena (String) y lo almacena en la variable opcion
		switch(opcion) {                            //declaración switch, donde opcion es la variable que se evaluará para determinar qué acción realizar
        case "De Pesos a Dólar":                       //switch que verifica si el valor de opcion es igual a "De Pesos a Dólar"
        	moneda.convertirPesosADolares(Minput);    //monedas.ConvertirPesosADolares(Minput);: Si el valor de opcion es "De Pesos a Dólar", se llama al método ConvertirPesosADolares() en el objeto monedas (que suponemos que es una instancia de la clase que realiza las conversiones de pesos a dólares). Se pasa el valor de Minput como argumento al método.
        	break;                                     //break para salir del switch
        case "De Pesos a Euro":
        	moneda.convertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	moneda.convertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	moneda.convertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	moneda.convertirPesosAWon(Minput);
        	break;
        case "De Dólar a Pesos":
        	pesos.convertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.convertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.convertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.convertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
        	pesos.convertirWonAPesos(Minput);
        	break;
	}
  }
}
