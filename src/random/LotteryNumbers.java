package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random numberman=new Random();
	 int firstnumber;
	 int secondnumber;
	 int thirdnumber;
	 int fourthnumber;
	 int fifthnumber;
	firstnumber = numberman.nextInt(51);
	secondnumber = numberman.nextInt(50)+50;
	thirdnumber = numberman.nextInt(100)+75;
	fourthnumber = numberman.nextInt(175)+64;
	fifthnumber = numberman.nextInt(239)+261;
	
	
	JOptionPane.showMessageDialog(null, firstnumber+ " "+secondnumber+ " "+thirdnumber+ " "+fourthnumber+ " "+fifthnumber );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
