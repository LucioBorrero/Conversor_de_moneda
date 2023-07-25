package conversorMoneda;

import javax.swing.JOptionPane;    

public class ConvertirAPesos {
   public void convertirDolaresAPesos(double valor) {
	   double precioDolar = valor * 3969.46; 
	   precioDolar = (double) Math.round(precioDolar * 100d)/100;
	   JOptionPane.showMessageDialog(null, "Tienes $ " +precioDolar+ "Pesos Colombianos");
   }
   public void convertirEurosAPesos (double valor) {
   	double precioEuro = valor * 4426.80;
   	precioEuro = (double) Math.round(precioEuro * 100d)/100;
   	JOptionPane.showMessageDialog(null, "Tienes $ " + precioEuro + "Pesos Colombianos");
   }
   public void convertirLibrasAPesos (double valor) {
   	double precioLibra = valor * 5112.74;
   	precioLibra = (double) Math.round(precioLibra * 100d)/100;
   	JOptionPane.showMessageDialog(null, "Tienes $ " + precioLibra + "Pesos Colombianos" );
   }
   public void convertirYenAPesos (double valor) {
   	double precioYen = valor * 28.04;
   	precioYen = (double) Math.round(precioYen * 100d);
   	JOptionPane.showConfirmDialog(null, "Tienes $ " + precioYen + "Pesos Colombianos");
   }
   public void convertirWonAPesos (double valor) {
   	double precioWon = valor * 3.09;
   	precioWon = (double) Math.round(precioWon * 100d)/100;
   	JOptionPane.showConfirmDialog(null, "Tienes $ " + precioWon + "Pesos Colombianos");
   }
}
