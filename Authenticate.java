import javax.swing.JOptionPane;

/**
 * Author: Xueyuan He(Brian)
 * Date:3/15/2017
 * Prfessor:Tanes
 * Purpose: CH3.3 Write a program to authenticate a user login for username and password
 */

public class Authenticate {

	public static void main(String[] args) {

		//Declare Strings
		String username= "Brian", password= "1231";
		
		//Create input dialog
		String inputUN= JOptionPane.showInputDialog(null,"Enter your username: ");
		String inputPW= JOptionPane.showInputDialog(null,"Enter your password: ");

		//Evaluating and Output
		if ((inputUN.equals(username))&&(inputPW.equals(password))) {
		JOptionPane.showMessageDialog(null,"Wellcome " + username);
		} else {
		JOptionPane.showMessageDialog(null,"Wrong username or password");}
	
	}
}
