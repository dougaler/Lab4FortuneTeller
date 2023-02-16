import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class thefortuneteller extends JFrame
{
    Random rnd = new Random();
    JPanel mainPnl;
    JPanel iconPnl;
    JPanel displayPnl;
    JPanel controlPnl;

    JTextArea displayTA;
    JScrollPane scroller;

    JLabel titleLbl;

    ImageIcon icon;

    JButton fortuneBtn;
    JButton quitBtn;

    int newNum;
    int numGuy = 0;

    boolean isSame = false;

    fortunegenerator itsafortune = new fortunegenerator();
    

    public thefortuneteller()
    {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createIconPanel();
        mainPnl.add(iconPnl, BorderLayout.NORTH);

        createDisplayPanel();
        mainPnl.add(displayPnl, BorderLayout.CENTER);

        createControlPanel();
        mainPnl.add(controlPnl, BorderLayout.SOUTH);

        add(mainPnl);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createIconPanel()
    {
        iconPnl = new JPanel();
        icon = new ImageIcon("src/fortuneteller.jpg");
        titleLbl = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        titleLbl.setFont(new Font("Courier", Font.BOLD,30));
        titleLbl.setBackground(new Color(147,112,219));
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);
        titleLbl.setHorizontalTextPosition(JLabel.CENTER);

        iconPnl.add(titleLbl);
    }

    private void createDisplayPanel()
    {
        displayPnl = new JPanel();
        displayTA = new JTextArea(10, 30);
        displayTA.setEditable(false);
        scroller = new JScrollPane(displayTA);
        displayPnl.add(scroller);
    }


    private void createControlPanel()
    {
        controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1, 4));

        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.addActionListener((ActionEvent ae) ->
        {
            do {
                newNum=rnd.nextInt(12);
                if(newNum == numGuy){
                    isSame = false;
                }else{
                    isSame = true;
                }
            }while(!isSame);
            String yourFortune = itsafortune.getFortune(newNum);
            displayTA.append(yourFortune + "\n");
            numGuy = newNum;
        });

        quitBtn = new JButton("Quit");
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        controlPnl.add(fortuneBtn);
        controlPnl.add(quitBtn);

    }
}
