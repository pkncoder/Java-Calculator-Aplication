// Also don't know what this is, but VsCode wants it
package Java_Calculator_Aplication;

// Awt stuff
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java swing stuff
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener
{
    // Add instances of these variables that the action listener will use
    // Buttons
    // Numbers
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

    // Opperations
    static JButton add;
    static JButton minus;
    static JButton multiply;
    static JButton devide;
    static JButton moduli;
    static JButton power;
    static JButton openParenthese;
    static JButton closeParenthese;
    static JButton squareRoot;
    static JButton cubeRoot;
    static JButton cos;
    static JButton sin;
    static JButton tan;
    static JButton pi;


    // Text bars
    static JTextField overHeadBar;

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
        this.setSize(350, 300);

        // Give it a background color of grey, but dark
        this.getContentPane().setBackground(Color.darkGray);

        // ------------------- Panels ---------------------- \\

        // Create all the panels
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
        keypadHolder.setPreferredSize(new Dimension(100, 50));
        keypadHolder.setPreferredSize(new Dimension(100, 50));
        keypadHolder.setPreferredSize(new Dimension(100, 50));

        // Text bars
        textBar.setPreferredSize(new Dimension(100, 50));

        // Opperation panel
        opperationPanel.setPreferredSize(new Dimension(50, 100));

        // Extras bars
        extrasBarBottom.setPreferredSize(new Dimension(100, 50));
        extrasBarLeft.setPreferredSize(new Dimension(50, 100));




        // Add the border layouts to everything
        
        // Keypad holder
        keypadHolder.setLayout(new GridLayout(3, 3));

        // Extras Bars
        extrasBarBottom.setLayout(null);
        extrasBarLeft.setLayout(null);

        // Operation panel
        opperationPanel.setLayout(new BoxLayout(opperationPanel, BoxLayout.PAGE_AXIS));

        // Text bar
        textBar.setLayout(new BorderLayout());



        // Create any colors needed
        // Keypads
        keypadHolder.setBackground(new Color(0, 0, 0, 0));
        keypadHolder.setBackground(new Color(0, 0, 0, 0));
        keypadHolder.setBackground(new Color(0, 0, 0, 0));

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

        // Opperations
        add = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        devide = new JButton("/");
        moduli = new JButton("%");
        power = new JButton("^");
        openParenthese = new JButton("(");
        closeParenthese = new JButton(")");
        squareRoot = new JButton("√");
        cubeRoot = new JButton("∛");
        cos = new JButton("cos");
        sin = new JButton("sin");
        tan = new JButton("tan");
        pi = new JButton("π");



        // Add the buttons to the panels
        // Keypad
        // Top
        keypadHolder.add(one);
        keypadHolder.add(two);
        keypadHolder.add(three);

        // Middle
        keypadHolder.add(four);
        keypadHolder.add(five);
        keypadHolder.add(six);

        // Bottom
        keypadHolder.add(seven);
        keypadHolder.add(eight);
        keypadHolder.add(nine);


        // Opperation panel
        opperationPanel.add(add);
        opperationPanel.add(minus);
        opperationPanel.add(multiply);
        opperationPanel.add(devide);
        opperationPanel.add(moduli);
        opperationPanel.add(power);
        opperationPanel.add(openParenthese);
        opperationPanel.add(closeParenthese);
        opperationPanel.add(squareRoot);
        opperationPanel.add(cubeRoot);
        opperationPanel.add(cos);
        opperationPanel.add(sin);
        opperationPanel.add(tan);
        opperationPanel.add(pi);



        // Action listeners
        // Numbers
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);

        
        // Opperations
        add.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        devide.addActionListener(this);
        moduli.addActionListener(this);
        power.addActionListener(this);
        openParenthese.addActionListener(this);
        closeParenthese.addActionListener(this);
        squareRoot.addActionListener(this);
        cubeRoot.addActionListener(this);
        cos.addActionListener(this);
        sin.addActionListener(this);
        tan.addActionListener(this);
        pi.addActionListener(this);

        // ---------------- Text Panels ----------------- \\

        // Make a text feild
        overHeadBar = new JTextField("Equation: ");

        // Set the bounds
        overHeadBar.setPreferredSize(new Dimension(100, 100));
        
        // Add to panel
        textBar.add(overHeadBar, BorderLayout.CENTER);

        // ----------------------- Let Everything Be Seen -------------------------- \\
        this.setVisible(true);
    }

    // Add the action listener
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
