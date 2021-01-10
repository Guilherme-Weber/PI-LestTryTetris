package Tetrix2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tetris extends JFrame {
	 
	  private JLabel BarraStatus;
	 
	  public Tetris() {
	    BarraStatus = new JLabel("0");
	    add(BarraStatus, BorderLayout.SOUTH);
	    Board board = new Board(this);
	    add(board);
	    board.start();
	    setSize(200, 400);
	    setTitle("My Tetris");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	  }
	 
	  public JLabel getBarraStatus() {
	    return BarraStatus;
	  }
	 
	  public static void main(String[] args) {
	    Tetris myTetris = new Tetris();
	    myTetris.setLocationRelativeTo(null);
	    myTetris.setVisible(true);
	  }

	 
	 
	}
