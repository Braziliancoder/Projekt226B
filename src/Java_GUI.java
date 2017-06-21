/**
 * Created by wizlamar on 26.04.17.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Java_GUI extends JFrame implements ActionListener {


    JButton bierButton = new JButton("Bier");
    JButton weinButton = new JButton("Wein");
    JButton ginButton = new JButton("Gin");
    JTextField TextField = new JTextField();
    JPanel buttonPanel = new JPanel();


    public Java_GUI() {

        setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(1, 3));

        bierButton.setPreferredSize(new Dimension(50, 20));
        weinButton.setPreferredSize(new Dimension(50, 20));
        ginButton.setPreferredSize(new Dimension(50, 20));

        buttonPanel.setMaximumSize(new Dimension(500, 200));

        buttonPanel.add(bierButton);
        buttonPanel.add(weinButton);
        buttonPanel.add(ginButton);

        add(buttonPanel, BorderLayout.CENTER);

        bierButton.addActionListener(this);
        weinButton.addActionListener(this);
        ginButton.addActionListener(this);

        setSize(1200, 670);
        setVisible(true);
        setTitle("Dr Völlscht isch dr töllscht");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
       /* if (e.getSource() == addButton) {
            listModel.addElement(TextField.getText());
        }
        if (e.getSource() == removeButton) {
            listModel.removeElementAt(toDoList.getSelectedIndex());
        } */
    }

    public static void main(String[] args) {
        Java_GUI JG = new Java_GUI();
    }

}