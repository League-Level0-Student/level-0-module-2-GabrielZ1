package random;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		String age = JOptionPane.showInputDialog("Are you 18 or older?");
		if (age.equals("Yes")) {
			JOptionPane.showInputDialog("Who do you think should be the next president?");
			JOptionPane.showMessageDialog(null, "I thought the same thing");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		

		}

	}

}