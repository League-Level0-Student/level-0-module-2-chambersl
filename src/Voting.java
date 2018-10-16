import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
  String age= JOptionPane.showInputDialog("How old are you?");
  int voter=Integer.parseInt(age);
	if (voter<18) {
		JOptionPane.showMessageDialog(null, "Your opinion doesnt matter!");
		
	}
	else {
		JOptionPane.showInputDialog("Who should be the president?");
	}
}
}
