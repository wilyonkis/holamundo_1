package dad.holamundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SaludarFrame extends JFrame {
	private JButton saludarButton;
	private JLabel saludarLabel;
	
	public SaludarFrame(){
		setTitle("Saludar");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setLocation(200, 500); //se puede indicar las coordenadas
		setLocationRelativeTo(null);
		
		saludarButton = new JButton();
		saludarButton.setText("Saluda");
		saludarButton.setSize(100, 30);
		saludarButton.setLocation(100, 150);
		saludarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			onSaludarButtonActionPerformed(e);
			}
		});
		
		saludarLabel = new JLabel("");
		saludarLabel.setSize(250, 40);
		saludarLabel.setLocation(50, 50);
		
		getContentPane().setLayout(null);
		getContentPane().add(saludarButton);
		getContentPane().add(saludarLabel);
	}

	protected void onSaludarButtonActionPerformed(ActionEvent e) {
		saludarLabel.setText("Hola mundo!!!");
	}
}
