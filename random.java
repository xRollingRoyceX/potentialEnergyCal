package bools;
import javax.swing.JOptionPane;
public class random {
	public static void main(String args[]){
		double mass;
		double gravity = 9.81;
		double height;
		String input;
		double PE;
		input = JOptionPane.showInputDialog("please enter the height"
				+ " of the object:");
		height = Double.parseDouble(input);
		input =  JOptionPane.showInputDialog("please enter the mass "
				+ "of the object.");
		mass = Double.parseDouble(input);
		PE = mass * gravity * height;
		JOptionPane.showMessageDialog(null, "the potential energy of thi"
				+ "s object is: " + PE);
	}
}
