import javax.swing.JOptionPane;

public class ExemploIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Média"));
		
		if( media>= 6.0) {
			JOptionPane.showMessageDialog(null,"Aprovado");
		}
		
	else  {
		JOptionPane.showMessageDialog(null,"Reprovado");
	}
		
	}
}
