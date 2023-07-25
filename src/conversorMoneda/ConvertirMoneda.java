package conversorMoneda;

import javax.swing.JOptionPane;  //paquete java swing proporciona métodos para mostrar diferentes tipos de ventanas emergentes de diálogo en una aplicación Java

public class ConvertirMoneda {
	
    public void convertirPesosADolares (double valor) {                             
    	double precioDolar = valor/3969.46;              
    	precioDolar = (double) Math.round(precioDolar * 100d)/100;                  //rendondea 
    	JOptionPane.showMessageDialog(null, "Tienes $ " + precioDolar + "Dolares"); //JOptionpane: clase de paquete Javax.swing.JOptionPane. Null es una argumento que muestra ventana emergete en el centro
    }                                                                               //showMessageDialog: metodo estatico de la clase JOptionPane que muestra venta emergente 
    public void convertirPesosAEuros (double valor) {
    	double precioEuro = valor/4426.80;
    	precioEuro = (double) Math.round(precioEuro * 100d)/100;
    	JOptionPane.showMessageDialog(null, "Tienes $ " + precioEuro + "Euros");
    }
    public void convertirPesosALibras (double valor) {
    	double precioLibra = valor/5112.74;
    	precioLibra = (double) Math.round(precioLibra * 100d)/100;
    	JOptionPane.showMessageDialog(null, "Tienes $ " + precioLibra + "Libras Esterlinas" );
    }
    public void convertirPesosAYen (double valor) {
    	double precioYen = valor/28.04;
    	precioYen = (double) Math.round(precioYen * 100d);
    	JOptionPane.showConfirmDialog(null, "Tienes $ " + precioYen + "Yuanes");
    }
    public void convertirPesosAWon (double valor) {
    	double precioWon = valor /3.09;
    	precioWon = (double) Math.round(precioWon * 100d)/100;
    	JOptionPane.showConfirmDialog(null, "Tienes $ " + precioWon + "Wons");
    }
}
