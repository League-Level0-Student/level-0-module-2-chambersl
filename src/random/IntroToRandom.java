//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		

		//4. Limit the random number between 0 and 100

		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

		//6. Challenge: Limit the random number between -222 and 88

		//1. Print out the value of r
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the 
		
		
		
		package random;
		 
		import javax.swing.JOptionPane;
		 
		public class RollerCoaster {
			public static void main(String[] args) {
				String height = JOptionPane.showInputDialog("What's your height?");
				int inches= Integer.parseInt(height);
				if (inches>=48) {
					JOptionPane.showMessageDialog(null, "You can get on!");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Grow up!");
				}
			}
		 
		}
		 
		//    Copyright (c) The League of Amazing Programmers 2013-2017
		//    Level 0
		 
		package random;
		 
		import java.util.Random;
		 
		public class IntroToRandom {
			public static void main(String[] args) {
				
				int r = 0;
				
				//3. Now make r random. 
				//   Create an object of the Random class
				//	 use .nextInt() to get a random number
				Random R = new Random();
				int number=R.nextInt((75 - 25)+1) + 25;
				System.out.println(number);
		 
				//4. Limit the random number between 0 and 100
		 
				//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		 
				//6. Challenge: Limit the random number between -222 and 88
		 
				//1. Print out the value of r
				
				//2. Run the program.  What number appears in the console?
				//   Run it again. Is the number the same?
			}
		}
		 
		package random;
		 
		import java.util.Random;
		 
		public class LotteryTicket {
		 
		 
			public static void main(String[] args) {
				
				int r = 0;
				
				//3. Now make r random. 
				//   Create an object of the Random class
				//	 use .nextInt() to get a random number
				Random R = new Random();
				int number=R.nextInt((99999 - 11111)+1) + 25;
				System.out.println(number);
			}

		}
		 
		//    Copyright (c) The League of Amazing Programmers 2013-2018
		//    Level 0
		 
		 
		package random;
		 
		import java.util.Random;
		 
		import javax.swing.JOptionPane;
		 
		public class Magic8Ball {
			
			// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {
			Random randomMaker = new Random();
		 
			// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int R = randomMaker.nextInt(4);
			// 3. Print out this variable
		System.out.println(R);
			// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask me a question!");
			// 5. If the random number is 0
		if (R==0) {
			JOptionPane.showMessageDialog(null," Yes");
		}
			// -- tell the user "Yes"
		 
			// 6. If the random number is 1
		if (R==1) {
			JOptionPane.showMessageDialog(null, "No");
			// -- tell the user "No"
		}
			// 7. If the random number is 2
			if (R==2) {
				JOptionPane.showMessageDialog(null,"ask google!");
			// -- tell the user "Maybe you should ask Google?"
			}
			// 8. If the random number is 3
				if (R==0) {
					JOptionPane.showMessageDialog(null, "That can't be real!");
			// -- write your own answer
				}	
		}
		}
		 
		//    Copyright (c) The League of Amazing Programmers 2013-2017
		//    Level 0
		 
		package random;
		 
		import java.util.Random;
		 
		import javax.swing.JOptionPane;
		 
		public class Validation {
			public static void main(String[] args) {
				
				Random randomMaker = new Random();
				
				
				
		for (int i = 0; i < 10; i++) {
			
			int randomNumber = randomMaker.nextInt(5);
			System.out.println(randomNumber);
		 
				// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber==1) {
			JOptionPane.showMessageDialog(null, "Nice shoes!");
		}
		if (randomNumber==2) {
			JOptionPane.showMessageDialog(null, "Nice jacket!");
		}
		if (randomNumber==3) {
			JOptionPane.showMessageDialog(null, "Nice pants!");
		}
		if (randomNumber==4) {
			JOptionPane.showMessageDialog(null, "Nice Hair!");
		}
		if (randomNumber==5) {
			JOptionPane.showMessageDialog(null, "Nice phone!");
		}
				// 2. Repeat all the code above 10 times
		}	
				// 3. Find someone to test out your program. They will like it :)
			}

		}


		//    Copyright (c) The League of Amazing Programmers 2013-2017
		//    Level 0

		package random;

		import java.awt.Dimension;
		import javax.swing.Icon;
		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;
		import javax.swing.JPanel;

		public class DiceRoll {

			private JFrame window = new JFrame("Roll the Dice!");
			private JPanel panel = new JPanel();
			private JButton rollButton = new JButton("CLICK HERE TO ROLL");
			private JLabel label = new JLabel();

			private Icon oneImg;
			private Icon twoImg;
			private Icon threeImg;
			private Icon fourImg;
			private Icon fiveImg;
			private Icon sixImg;

			public static void main(String[] args) {
				new DiceRoll().run();
			}
			
			public void run() {
				try {
					oneImg = new ImageIcon(getClass().getResource("dice 1.png"));
					twoImg = new ImageIcon(getClass().getResource("dice 2.png"));
					threeImg = new ImageIcon(getClass().getResource("dice 3.png"));
					fourImg = new ImageIcon(getClass().getResource("dice 4.png"));
					fiveImg = new ImageIcon(getClass().getResource("dice 5.png"));
					sixImg = new ImageIcon(getClass().getResource("dice 6.png"));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Could not find one or more dice images");
					System.exit(0);
				}

				label.setIcon(oneImg);

				rollButton.addActionListener((e) -> {

					// 1. Make randomChoice equal to a random number between 1 and 6
					int randomChoice = 5;

					// 2. Fix the code below so that it displays the correct image
					if (randomChoice == 0) {
						label.setIcon(oneImg);
					} else if (randomChoice == 1) {
						label.setIcon(twoImg);
					} else if (randomChoice == 2) {
						label.setIcon(threeImg);
					} else if (randomChoice == 3) {
						label.setIcon(fourImg);
					} else if (randomChoice == 4) {
						label.setIcon(fiveImg);
					} else if (randomChoice == 5) {
						label.setIcon(sixImg);
					}	else if (randomChoice == 6) {
					}
				});

				panel.setPreferredSize(new Dimension(700, 700));
				panel.add(rollButton);
				panel.add(label);
				window.add(panel);
				window.setVisible(true);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.pack();
			}

		}


		//    Copyright (c) The League of Amazing Programmers 2013-2017
		//    Level 0

		package random;

		import java.awt.Dimension;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.util.Random;

		import javax.swing.Icon;
		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;
		import javax.swing.JPanel;

		public class RockPaperScissors extends JPanel implements ActionListener{
		  
			private JFrame window = new JFrame("Rock Paper Scissors");
			private JButton rockButton = new JButton();
			private JButton paperButton = new JButton();
			private JButton scissorsButton = new JButton();

			private JLabel instructionLabel = new JLabel();

			private Icon rockImage;
			private Icon paperImage;
			private Icon scissorsImage;

			private Dimension buttonDim = new Dimension(300, 200);
		    
		    public void run(){

				try {
				
					rockImage = new ImageIcon(getClass().getResource("rock.png"));
					paperImage = new ImageIcon(getClass().getResource("paper.jpeg"));
					scissorsImage = new ImageIcon(getClass().getResource("scissors.jpeg"));

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Cannot find one or more of your images");
				}
		        
				rockButton.setIcon(rockImage);
				paperButton.setIcon(paperImage);
				scissorsButton.setIcon(scissorsImage);
		        
		        rockButton.addActionListener(this);
		        paperButton.addActionListener(this);
		        scissorsButton.addActionListener(this);
		        
		        rockButton.setPreferredSize(buttonDim);
		        paperButton.setPreferredSize(buttonDim);
		        scissorsButton.setPreferredSize(buttonDim);
		        
		        instructionLabel.setText("Choose Your Weapon!");
		        
		        add(instructionLabel);
		        add(rockButton);
		        add(paperButton);
		        add(scissorsButton);
		        
		        window.add(this);
		        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        window.setVisible(true);
		        window.pack();
		    }
		    
		    public static void main(String[] args) {
		        new RockPaperScissors().run();
		    }


		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        //1. Run the program and play many rounds of Rock Paper Scissors. Does the computer always choose the same thing?

		        //2. Change the value of opponentSelection to be a random number between 0 and 2;
			//   Don't forget to create a Random object.
		        Random R = new Random();
		        int opponentSelection= R.nextInt(2);
		        //2. Change the value of opponentSelection to be a random number between 0 and 2; 
		       
		        
		        //3. Run the program again. Is the result different?
		 
		        int selection = 0;
		       
		        if(e.getSource() == paperButton){
		            selection = 1;
		        }else if(e.getSource() == scissorsButton){
		            selection = 2;
		        }
		        
		        JOptionPane.showMessageDialog(null, "You chose: " + convertSelection(selection) + ".\n"
		                    + "The computer chose: " + convertSelection(opponentSelection) + ".\n");
		        
		        if(selection == opponentSelection){
		            JOptionPane.showMessageDialog(null, "No Winner.  Play again.");
		        }else if((selection == 0 && opponentSelection == 2) || 
		                 (selection == 1 && opponentSelection == 0) ||
		                 (selection == 2 && opponentSelection == 1)){
		            JOptionPane.showMessageDialog(null, "You Win!");
		        }else{
		            JOptionPane.showMessageDialog(null, "You Lose!");
		        }
		    }
		    
		    private String convertSelection(int s){
		       if (s==0)
		            return "ROCK";
		       else if (s==1)
		            return "PAPER";
		       else if (s==2)
		            return "SCISSORS";
		       else
		            return "";
		        }
		    }

	}#000000#000000#000000#00000
}