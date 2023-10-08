package Java_Calculator_Aplication;

// Awt stuff
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java swing stuff
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main extends JFrame
{
    // Add instances of these variables that the action listener will use
    static JButton one;
    static JButton two;
    static JButton three;
    static JButton four;
    static JButton five;
    static JButton six;
    static JButton seven;
    static JButton eight;
    static JButton nine;
    static JButton zero;

    // Still don't know
    Main()
    {

        // --------------- JFrame Setup -------------- \\
        
        // Give it a default for closing the program
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the title
        this.setTitle("Calculator App - Make by Pkncoder");

        // Give it a layout
        this.setLayout(new BorderLayout());

        // Give the app a normal size
        this.setSize(500, 500);

        // Give it a background color of grey, but dark
        this.getContentPane().setBackground(Color.darkGray);

        // Let it be seen
        this.setVisible(true);

        // ------------------- Panels ---------------------- \\

        // Create all the panels
        // Keypad pannels
        JPanel keypadTop = new JPanel();
        JPanel keypadMiddle = new JPanel();
        JPanel keypadBottom = new JPanel();

        // Keypad holder
        JPanel keypadHolder = new JPanel();

        // Text at the top
        JPanel textBar = new JPanel();

        // Opperation panel
        JPanel opperationPanel = new JPanel();
    
        // Extras bars
        JPanel extrasBarBottom = new JPanel();
        JPanel extrasBarLeft = new JPanel();



        // Create perfered sizes
        // Keypads
        keypadTop.setPreferredSize(new Dimension(100, 50));
        keypadMiddle.setPreferredSize(new Dimension(100, 50));
        keypadBottom.setPreferredSize(new Dimension(100, 50));

        // Text bars
        textBar.setPreferredSize(new Dimension(100, 50));

        // Opperation panel
        opperationPanel.setPreferredSize(new Dimension(50, 100));

        // Extras bars
        extrasBarBottom.setPreferredSize(new Dimension(100, 50));
        extrasBarLeft.setPreferredSize(new Dimension(50, 100));




        // Add the border layouts to everything
        // Keypads
        keypadTop.setLayout(new BorderLayout());
        keypadMiddle.setLayout(new BorderLayout());
        keypadBottom.setLayout(new BorderLayout());

        // Keypad holder
        keypadHolder.setLayout(new BorderLayout());

        // Extras Bars
        extrasBarBottom.setLayout(null);
        extrasBarLeft.setLayout(null);

        // Operation panel
        opperationPanel.setLayout(null);

        // Text bar
        textBar.setLayout(null);



        // Create any colors needed
        // Keypads
        keypadTop.setBackground(new Color(0, 0, 0, 0));
        keypadMiddle.setBackground(new Color(0, 0, 0, 0));
        keypadBottom.setBackground(new Color(0, 0, 0, 0));

        // Keypad holder
        keypadHolder.setBackground(new Color(0, 0, 0, 0));

        // Opperation bar
        opperationPanel.setBackground(new Color(0, 0, 0, 0));

        // Text bar
        textBar.setBackground(new Color(0, 0, 0, 0));

        // Extras bars
        extrasBarBottom.setBackground(new Color(0, 0, 0, 0));
        extrasBarLeft.setBackground(new Color(0, 0, 0, 0));



        // Add the panels to the frame, or other pannels
        // Keypad holder
        this.add(keypadHolder, BorderLayout.CENTER);

        // Keypads
        keypadHolder.add(keypadTop, BorderLayout.NORTH);
        keypadHolder.add(keypadMiddle, BorderLayout.CENTER);
        keypadHolder.add(keypadBottom, BorderLayout.SOUTH);

        // Opperation panel
        this.add(opperationPanel, BorderLayout.EAST);

        // Extras bars
        this.add(extrasBarBottom, BorderLayout.SOUTH);
        this.add(extrasBarLeft, BorderLayout.WEST);

        // Text bar
        this.add(textBar, BorderLayout.NORTH);

        // ----------------- Buttons, this is a long one ---------------- \\

        // Make the buttons
        // Numbers
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");



        // Add the buttons to the panels
        // Keypad
        // Top
        keypadTop.add(one, BorderLayout.WEST);
        keypadTop.add(two, BorderLayout.CENTER);
        keypadTop.add(three, BorderLayout.EAST);

        // Middle
        keypadMiddle.add(four, BorderLayout.WEST);
        keypadMiddle.add(five, BorderLayout.CENTER);
        keypadMiddle.add(six, BorderLayout.EAST);

        // Bottom
        keypadBottom.add(seven, BorderLayout.WEST);
        keypadBottom.add(eight, BorderLayout.CENTER);
        keypadBottom.add(nine, BorderLayout.EAST);

    }

    public static void main(String[] args)
    {
        new Main();
    }
}
