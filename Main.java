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

// Do ArrayList
import java.util.ArrayList;

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

    // Extra buttons
    static JButton clear;


    // Text bars
    static JTextField overHeadBar;
    static String overHeadBartext = "";

    // Make a button arraylist so we can mach up data for action listener
    static ArrayList<JButton> buttons = new ArrayList<JButton>();

    // Make a normal array for all of the print out-buttons so we can simply grab some strings
    static String[] buttonsActions = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "%", "^", "(", ")", "√", "∛", "cos(", "sin(", "tan(", "π"};


    // Make another arraylist so we can do the diferent commands for the extras buttons
    static ArrayList<JButton> extraActionsList = new ArrayList<JButton>();

    // Then hook up the actions
    static String[] extraActionsKeyCommands = {"/clearOverHeadBar"};


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

        // Text bars
        textBar.setPreferredSize(new Dimension(80, 80));

        // Opperation panel
        opperationPanel.setPreferredSize(new Dimension(80, 80));

        // Extras bars
        extrasBarBottom.setPreferredSize(new Dimension(80, 80));
        extrasBarLeft.setPreferredSize(new Dimension(80, 80));




        // Add the border layouts to everything
        
        // Keypad holder
        keypadHolder.setLayout(new GridLayout(3, 3));

        // Extras Bars
        extrasBarBottom.setLayout(new BorderLayout());
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

        // Extra buttons
        clear = new JButton("clear");



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


        // Seperate 0 Spot
        extrasBarBottom.add(zero, BorderLayout.CENTER);


        // Extra buttons
        extrasBarBottom.add(clear, BorderLayout.WEST);



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
        zero.addActionListener(this);

        
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


        // Extra buttons
        clear.addActionListener(this);



        // Add the buttons to the Button array list
        // Numbers
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(zero);

        // Opporations
        buttons.add(add);
        buttons.add(minus);
        buttons.add(multiply);
        buttons.add(devide);
        buttons.add(moduli);
        buttons.add(power);
        buttons.add(openParenthese);
        buttons.add(closeParenthese);
        buttons.add(squareRoot);
        buttons.add(cubeRoot);
        buttons.add(cos);
        buttons.add(sin);
        buttons.add(tan);
        buttons.add(pi);


        // Add the extras buttons to the extra button array list
        extraActionsList.add(clear);


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

        // Loop through an array to play the matching game
        for (int k = 0; k < buttonsActions.length; k++)
        {
            if (e.getSource() == buttons.get(k))
            {
                // Print it out to the over head bar
                overHeadBartext += buttonsActions[k];
                overHeadBar.setText("Equation: " + overHeadBartext);

                // Break the loop so it stops
                break;
            }
        }

        // Loop through an array for the extra commands
        for (int k = 0; k < extraActionsKeyCommands.length; k++)
        {
            // Test to see if it is indeed one of these
            if (e.getSource() == extraActionsList.get(k))
            {
                // Break at the end to stop the loop
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
