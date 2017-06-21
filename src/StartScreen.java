import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wizlamar on 27.04.17.
 */
public class StartScreen extends JFrame implements ActionListener {

    //meine Swing Komponente
    JLabel groesseLabel = new JLabel("Hier Ihre Grösse angeben: ");
    JLabel gewichtLabel = new JLabel("Hier Ihr Gewicht angeben: ");
    JLabel fskLabel = new JLabel("FSK 18 bitte Bestätigen Sie dass sie über 18 Jahre alt sind");

    JTextField groessetxt = new JTextField(" ");
    JTextField gewichttxt = new JTextField(" ");

    JCheckBox check1 = new JCheckBox("Ja ich bin 18");


    JButton weiterButton = new JButton("Ready to Drink");


    JPanel persdatPanel = new JPanel();
    JPanel fskPanel = new JPanel();

    public StartScreen() {

        setLayout(new BorderLayout());
        persdatPanel.setLayout(new GridLayout(2, 2));
        fskPanel.setLayout(new GridLayout(2, 1));

        //Schrift Design
        fskLabel.setForeground(Color.RED);
        fskLabel.setFont(fskLabel.getFont().deriveFont(Font.BOLD, 14f));

        //Komponente in Panels implementieren
        persdatPanel.add(groesseLabel);
        persdatPanel.add(groessetxt);
        persdatPanel.add(gewichtLabel);
        persdatPanel.add(gewichttxt);

        fskPanel.add(fskLabel);
        fskPanel.add(check1);
        fskPanel.add(weiterButton);

        persdatPanel.add(fskPanel);

        weiterButton.setVisible(false);

        //Panels Positionieren
        add(fskPanel, BorderLayout.SOUTH);
        add(persdatPanel, BorderLayout.CENTER);

        setSize(850, 200);
        setVisible(true);
        setTitle("Dr Völlscht isch dr töllscht");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Action Listener Variabel hinzufügung
        check1.addActionListener(this);
        weiterButton.addActionListener(this);

    }

    public static void main(String[] args) {
        StartScreen s = new StartScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.weiterButton) {
            Java_GUI jg = new Java_GUI();
        }
        if (e.getSource() == this.check1) {

            if (check1.isSelected()) {
                JOptionPane.showMessageDialog(null, "Sie habe hiermit bestätigt das Sie über 18 sind!");
                weiterButton.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Sie sind noch nicht 18!");
                weiterButton.setVisible(false);
            }
        }
    }
}