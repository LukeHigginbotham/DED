package dedsocialstab;
//Luke Higginbotham 899568628
//CSC 3380

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

class DEDSocialsTab extends JFrame implements ActionListener 
{
    //Socials Tab constructor which builds the frame and fills it with a 
    //calendar button and an editable employee role text area.
    public DEDSocialsTab(String title) 
    {
        super(title);
        setBounds(40, 40, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("Options");
        menuBar.add(file);
        JMenuItem open = new JMenuItem("Open Calendar");
        open.addActionListener(this);
        file.add(open);
        JMenuItem back = new JMenuItem("Back To Home");
        back.addActionListener(this);
        file.add(back);
        JTextArea ta = new JTextArea("Name\tRole\t  Phone #\t  Email"
                + "\n-----------------------------------------------------------"
                + "----------------------------------\n"
                + "Nate Payton\tFront Desk\t  255-234-4567\t  npayto@gmail.com\n"
                + "Zak Elawasi\tRecords\t  255-131-4767\t  zelaw@gmail.com\n"
                + "Carson Witt\tGroundskeeper\t  255-431-8273\t  wittbr@gmail.com\n"
                + "Eli Negev\tGroundskeeper\t  255-879-3459\t  enegev@yahoo.com\n"
                + "Paul Brian\tSales Prof.\t  255-837-2932\t  gemini@gmail.com\n"
                + "Harrison Griffin\tGravedigger\t  255-732-2314\t  harryba@gmail.com");

        getContentPane().add(BorderLayout.CENTER, ta);
    }
    
    //Main method that calls the socials tab to be opened as a component
    public static void main(String[] args) 
    {
        DEDSocialsTab DED = new DEDSocialsTab("Social");
        DED.setVisible(true);
    }
    
    //Displayed Calendar
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String choice = ae.getActionCommand();
        if (choice.equals("Open Calendar")) 
        {
            JOptionPane.showMessageDialog(this, "                                               "
                    + "DECEMBER 2020\n--------------------------------------------"
                    + "--------------------------------------------------------\n"
                    + "|Sunday   Monday   Tuesday   Wednesday   Thursday   Friday   Saturday|\n"
                    + "----------------------------------------------------------------------------------------------------\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n");
        }
        else if(choice.equals("Back To Home"))
        {
            setVisible(false);
        }
    }
}
